package ch06_OOP_implementation;

/* 클래스 필드와 인스턴스 필드 비교 예제 */

// 하나의 소스파일에 여러 개의 클래스 선언이 가능하다.
// 단 소스 파일 이름은 public 으로 선언한 클래스 이름으로 지정해야한다.
class Count {
    public static int totalCount; // 클래스 필드. 프로그램 시작 시 코드 메모리에 생성됨.
    int count; // 인스턴스 필드. 인스턴스 생성 시 힙 메모리에 생성됨.
}

public class CountTest {
    public static void main(String[] args) {
        System.out.println("실행 시작");
        Count c1 = new Count(); // 참조변수 c1은 스택 메모리에 생성. c1이 가리키는 인스턴스는 힙 메모리에 생성.
    }
}
