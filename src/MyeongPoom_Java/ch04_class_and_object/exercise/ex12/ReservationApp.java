package MyeongPoom_Java.ch04_class_and_object.exercise.ex12;

import java.util.Scanner;

public class ReservationApp {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();
        reservation.run();
    }
}

class Reservation {
    private Scanner sc;
    private Audience[][] seats;

    public Reservation() {
        sc = new Scanner(System.in);
        seats = new Audience[3][10];
    }

    public void run() {
        System.out.println("명품 콘서트홀 예약 시스템입니다. ");

        while (true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4 >>");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    reserve();
                    break;
                case 2:
                    inquireAll();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다...");
                    return;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }

    private void reserve() {
        while (true) {
            System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
            int seatClass = sc.nextInt(); // 1, 2, 3
            if (seatClass < 1 || seatClass > 3) { // 번호 유효성 검사
                System.out.println("잘못된 입력입니다.");
                continue;
            }
            inquireSeatsByClass(seatClass);

            // 이름, 번호 입력
            System.out.print("이름 >> ");
            String name = sc.next();

            System.out.print("번호 >> ");
            int seatNum = sc.nextInt();
            if (seatNum < 1 || seatNum > 10) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            reserveSeat(name, seatClass, seatNum);
            break;
        }
    }

    private void reserveSeat(String name, int seatClass, int seatNum) {
        Audience audience = new Audience(name, numToSeatClass(seatClass), seatNum);
        seats[seatClass - 1][seatNum - 1] = audience;
    }

    private void inquireAll() {
        for (int i = 0; i < 3; i++) {
            System.out.print(numToSeatClass(i + 1) + ">> ");

            for (int j = 0; j < 10; j++) {
                if (seats[i][j] != null) {
                    System.out.print(seats[i][j].getName() + " ");
                    continue;
                }
                System.out.print("--- ");
            }
            System.out.println();
        }
        System.out.println("<<<조회를 완료하였습니다.>>>");
    }

    private void inquireSeatsByClass(int seatClass) {
        System.out.print(numToSeatClass(seatClass) + ">> ");

        for (int i = 0; i < 10; i++) {
            if (seats[seatClass - 1][i] != null) {
                System.out.print(seats[seatClass - 1][i].getName() + " ");
                continue;
            }
            System.out.print("--- ");
        }
        System.out.println();
    }

    private void cancel() {
        System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
        int seatClass = sc.nextInt(); // 1, 2, 3
        if (seatClass < 1 || seatClass > 3) { // 번호 유효성 검사
            System.out.println("잘못된 입력입니다.");
            return;
        }

        inquireSeatsByClass(seatClass);
        System.out.print("이름 >> ");
        String name = sc.next();
        if (!cancelSeat(name, seatClass)) {
            System.out.println("이름이 존재하지 않습니다.");
            return;
        }
        System.out.println(name + "님 좌석이 취소되었습니다.");
    }

    private boolean cancelSeat(String name, int seatClass) {
        boolean isCancelled = false;

        for (int i = 0; i < 10; i++) {
            if (seats[seatClass - 1][i] != null) {
                if (seats[seatClass - 1][i].getName().equals(name)) {
                    seats[seatClass - 1][i] = null;
                    isCancelled = true;
                    break;
                }
            }
        }

        return isCancelled;
    }

    private String numToSeatClass(int seatClass) {
        switch (seatClass) {
            case 1:
                return "S";
            case 2:
                return "A";
            case 3:
                return "B";
        }
        return null;
    }
}

class Audience {
    private String name;
    private String seatClass;
    private int seatNumber;

    public Audience(String name, String seatClass, int seatNumber) {
        this.name = name;
        this.seatClass = seatClass;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return name;
    }

    public String getSeatClass() {
        return seatClass;
    }

    public int getSeatNumber() {
        return seatNumber;
    }
}
