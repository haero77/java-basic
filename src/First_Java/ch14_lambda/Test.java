package First_Java.ch14_lambda;

public class Test {
    public static MyInterface test() {
        return new MyInterface() {
            @Override
            public void print() {
                System.out.println("hello");
            }
        };
    }
}
