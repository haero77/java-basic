package MyeongPoom_Java.ch04_class_and_object.practice;

// 연습문제 6번
public class TV {
    private int size;
    private String manufacturer;

    public TV() {
        this(32, "LG");
    }

    public TV(String manufacturer) {
        this(32, manufacturer);
    }

    public TV(int size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
        System.out.println(this.size + "인치 " + this.manufacturer);
    }
}
