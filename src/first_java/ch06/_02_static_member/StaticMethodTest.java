package first_java.ch06._02_static_member;

public class StaticMethodTest {
    int num = 123; // 인스턴스 필드. 인스턴스 생성된 후 사용 가능하다.

    public static void main(String[] args) {
        StaticMethodTest.print1();
        StaticMethodTest exam = new StaticMethodTest();
        exam.print2();
    }

    public static void print1() { // static 메서드
        /*
            인스턴스 필드는 인스턴스를 생성한 후에 사용 가능하므로,
            인스턴스 생성 전에 사용가능한 static 메서드에서는 인스턴스 필드와 인스턴스 메서드를 사용할 수 없다.
         */

        int num2 = num; // 오류! : static 메서드에서는 인스턴스 필드 사용 불가능
        System.out.println("hello");
    }

    public void print2() { // 인스턴스 메서드
        /*
            인스턴스 메서드를 호출하는 시점에서는 이미 인스턴스가 생성되어 인스턴스 필드가 준비되어 있는 상태이므로,
            인스턴스 메서드 내부에서는 인스턴스 필드의 사용이 가능하다.
         */

        int num3 = num; // 인스턴스 필드 사용
        System.out.println();
    }
}
