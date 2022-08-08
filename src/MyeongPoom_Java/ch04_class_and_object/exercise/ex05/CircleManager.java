package MyeongPoom_Java.ch04_class_and_object.exercise.ex05;

import java.util.Scanner;

class Circle {
    private double x, y;
    private int radius;

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void show() {
        System.out.printf("(%.1f, %.1f) %d\n", x, y, radius);
    }

    static Circle getLargest(Circle[] arr) { // 가장 큰 면적의 원 리턴
        int maxRadius = arr[0].radius;
        Circle largestCircle = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].radius > maxRadius) {
                maxRadius = arr[i].radius;
                largestCircle = arr[i];
            }
        }

        return largestCircle;
    }
}

public class CircleManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle[] c = new Circle[3];

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius  >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();

            c[i] = new Circle(x, y, radius);
        }

        // 실습 5번
//        for (int i = 0; i < c.length; i++) {
//            c[i].show();
//        }

        // 실습 6번 : 가장 면적이 큰 원 찾기
        Circle largestCircle = Circle.getLargest(c);
        largestCircle.show();
    }
}
