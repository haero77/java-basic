package MyeongPoom_Java.ch05_inheritance.example;

/* 부모 생성자 호출 예제 */
class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.printf("(%d, %d)\n", x, y);
    }
}

class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        super(x, y); // 부모 생성자 호출
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint();
    }
}

public class ColorPointEx {
    public static void main(String[] args) {
        ColorPoint cp = new ColorPoint(3, 4, "blue");
        cp.showColorPoint();
    }
}
