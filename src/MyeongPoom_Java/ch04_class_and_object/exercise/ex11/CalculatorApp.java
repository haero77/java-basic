package MyeongPoom_Java.ch04_class_and_object.exercise.ex11;

import java.util.Scanner;

class Add {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a + b;
    }
}

class Sub {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a - b;
    }
}

class Mul {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        return a * b;
    }
}

class Div {
    private int a, b;

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calculate() {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        return result;
    }
}

public class CalculatorApp {
    Scanner sc = new Scanner(System.in);

    public void run() {
        while (true) {
            System.out.print("두 정수와 연산자를 입력하시오>>");

            int result = input();
            if (result == Integer.MIN_VALUE) {
                System.out.println("잘못된 연산자입니다.");
            } else {
                System.out.println(result);
            }
        }
    }

    private int input() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        
        return specifier(a, b, operator);
    }

    // 연산자 종류에 따라
    private int specifier(int a, int b, char operator) {
        if (operator == '+') {
            Add add = new Add();
            add.setValue(a, b);
            return add.calculate();
        }

        if (operator == '-') {
            Sub sub = new Sub();
            sub.setValue(a, b);
            return sub.calculate();
        }

        if (operator == '*') {
            Mul mul = new Mul();
            mul.setValue(a, b);
            return mul.calculate();
        }

        if (operator == '/') {
            Div div = new Div();
            div.setValue(a, b);
            return div.calculate();
        }

        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        CalculatorApp calApp = new CalculatorApp();
        calApp.run();
    }
}
