package programmers_java_novice;

public class CarExam {

    public static void main(String[] args) {
        // Car 객체 생성
        Car c1 = new Car();
        Car c2 = new Car();

        // 필드 이용
        c1.name = "소방차"; // c1이 가리키는 객체의 name 필드를 "소방차" 로 설정
        c1.number = 1234; // c1이 가리키는 객체의 number 필드를 12345 로 설정

        c2.name = "구급차";
        c2.number = 9999;

        System.out.println(c1.name + " " + c1.number); // c1이 참조하는 객체의 필드 출력
        System.out.println(c2.name + " " + c2.number); // c2가 참조하는 객체의 필드 출력
    }
}