package First_Java.ch14_lambda;

@FunctionalInterface
interface Multiply {
    double getValue();
}

public class Test02 {

    public static void main(String[] args) {
        Multiply multiply;
        multiply = () -> 3.14 * 2; // getValue() 를 오버라이딩하여 구현

        System.out.println(multiply.getValue());

        multiply = () -> 4 * 3.0;
        System.out.println(multiply.getValue());
    }
}
