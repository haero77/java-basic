package First_Java.ch14_lambda;

interface Verify {
    boolean check(int number1, int number2);
}

public class Test03 {
    public static void main(String[] args) {
        Verify isEven = (n, d) -> {
            n -= 2;
            d += 10;
            return n > d;
        };
        System.out.println(isEven.check(20, 10));
    }
}
