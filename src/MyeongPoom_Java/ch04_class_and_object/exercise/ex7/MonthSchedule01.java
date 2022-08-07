package MyeongPoom_Java.ch04_class_and_object.exercise.ex7;

import java.util.Scanner;

class MonthSchedule01 {
    private Scanner scanner; // scanner를 이렇게 써도 되는지 의문
    private Day[] dayArray;

    public MonthSchedule01(int days) {
        scanner = new Scanner(System.in);
        dayArray = new Day[days];
    }

    public void run() { // 프로그램 실행
        System.out.println("이번 달 스케쥴 관리 프로그램.");

        while (true) {
            System.out.print("할 일(입력: 1, 보기: 2, 끝내기: 3) >> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                input();
            } else if (choice == 2) {
                view();
            } else if (choice == 3) {
                finish();
                break;
            } else {
                System.out.println("잘못 입력하셧습니다.");
            }
        }
    }

    // 할 일 추가
    public void input() {
        int day = getDay();
        dayArray[day - 1] = new Day();

        // 할 일 입력
        System.out.println("할 일(빈칸없이입력)?");
        String toDo = scanner.next();
        dayArray[day - 1].set(toDo);
    }

    // 할 일 보여주기
    public void view() {
        int day = getDay();

        if (dayArray[day - 1] == null) {
            System.out.println(day + "일의 할 일이 존재하지 않습니다.");
            return;
        }

        System.out.println(day + "일의 할 일은 " + dayArray[day - 1].get() + "입니다.");
    }

    // 프로그램 종료
    public void finish() {
        System.out.println("프로그램을 종료합니다.");
    }

    // 사용자로부터 1~30 날짜 입력
    public int getDay() {
        while (true) {
            System.out.println("날짜(1~30)?");
            int day = scanner.nextInt();

            if (day < 1 || day > 30) {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }

            return day;
        }
    }
}
