package jungsuk_of_java.ch14_lambda;

@FunctionalInterface
interface MyFunction {
    void run();
}

public class LambdaEx1 {
    // 람다식을 참조하는 참조변수를 매개변수로 지정
    static void execute(MyFunction f) {
        f.run();
    }

    // 리턴 타입이 함수형 인터페이스인 메서드 -> "이 메서드(getMyFunction)는 람다식을 리턴한다"
    static MyFunction getMyFunction() {
//        MyFunction f = () -> System.out.println("f3.run()");
//        return f;
        return () -> System.out.println("f3.run()");
    }

    public static void main(String[] args) {
        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        // 익명 클래스를 이용하여 MyFunction의 run()을 구현
        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(() -> System.out.println("custom run()"));
    }
}
