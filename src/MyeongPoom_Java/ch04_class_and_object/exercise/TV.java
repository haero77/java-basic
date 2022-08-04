package MyeongPoom_Java.ch04_class_and_object.exercise;

public class TV {
    private String manufacturer;
    private int year;
    private int size;

    public TV(String manufacturer, int year, int size) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.size = size;
    }

    public void show() {
        System.out.println(this.manufacturer + "에서 만든 " + this.year + "년 " + size + "인치");
    }
}

class TVTest {
    public static void main(String[] args) {
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
