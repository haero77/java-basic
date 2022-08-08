package MyeongPoom_Java.ch04_class_and_object.exercise.ex08;

import java.util.Scanner;

class Phone {
    private String name;
    private String tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class PhoneBook {
    private Scanner sc;
    private Phone[] phoneArray;

    public PhoneBook() {
        sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("프로그램을 시작합니다...");

        // 전화번호부 생성
        create();

        // 검색
        search();

        System.out.println("프로그램을 종료합니다...");
    }

    // 인원 수 대로 Phone 인스턴스 생성
    public void create() {
        System.out.print("인원 수 >>");
        int peopleCount = sc.nextInt();
        phoneArray = new Phone[peopleCount];

        for (int i = 0; i < peopleCount; i++) {
            System.out.print("이름과 전화번호(이름과 전화번호는 빈 칸없이 입력) >>");
            String name = sc.next();
            String tel = sc.next();
            phoneArray[i] = new Phone(name, tel);
        }

        System.out.println("저장되었습니다...");
    }

    // 검색
    public void search() {
        while (true) {
            System.out.print("검색할 이름 >>");
            String name = sc.next();

            // 프로그램 종료 조건
            if (name.equals("그만")) {
                return;
            }

            searchName(name);
        }
    }

    // 이름에 맞는 번호 검색
    public void searchName(String name) {
        boolean isExists = false; // 검색한 이름에 해당하는 Phone 인스턴스 존재 여부
        for (Phone phone : phoneArray) {
            if (name.equals(phone.getName())) {
                System.out.println(name + "의 번호는 " + phone.getTel() + " 입니다.");
                isExists = true;
                break;
            }
        }

        // 이름이 존재하지 않는 경우
        if (!isExists) {
            System.out.println(name + " 이 없습니다.");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.run();
    }
}



