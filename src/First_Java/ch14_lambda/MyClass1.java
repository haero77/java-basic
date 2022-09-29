package First_Java.ch14_lambda;

public class MyClass1 implements MyInterface {
    @Override
    public void print() {
        System.out.println("MyClass1");
    }

    public static void main(String[] args) {
        MyInterface mi = new MyInterface() {
            @Override
            public void print() {
                System.out.println("익명 클래스로 인터페이스 구현하기");
            }
        };

        new MyClass1().print();
        mi.print();

        // 선언, 생성, 호출을 한 번에 처리하여 구현
        (new MyInterface() {
            @Override
            public void print() {
                System.out.println("한방구현");
            }
        }).print();

        MyInterface newMyInterface = Test.test();
        newMyInterface.print();
    }
}
