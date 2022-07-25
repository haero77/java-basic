package programmers_java_novice;

public class MyClass {

    // 메서드 선언
    public void method1() {
        System.out.println("method1 실행");
    }

    public void method2(int x) {
        System.out.println(x + "를 이용한 method2 실행");
    }

    public int method3() {
        System.out.println("method3 실행");
        return 10;
    }

    public void method4(int x, int y) {
        System.out.println(x + y + "method4 실행");
    }

    public int method5(int y) {
        System.out.println(y + "를 이용한 method5 실행");
        return 5;
    }
}
