package First_Java.ch08_polymorphism_and_innerClass.innerClass;

public class OuterClass { // 외부 클래스

    class instanceClass { // 인스턴스 멤버 클래스
        int a;

        void method2() {
            System.out.println("instanceClass : " + a);
        }
    }

    static class staticClass {
        int instanceField;
        static int staticField;

        void instanceMethod() {
            System.out.println("Static Class - instance Method : " + instanceField);
        }

        static void staticMethod() {
            System.out.println("Static Class - static Method : " + staticField);
        }
    }
}
