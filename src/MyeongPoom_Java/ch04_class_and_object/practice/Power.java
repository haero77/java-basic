package MyeongPoom_Java.ch04_class_and_object.practice;

public class Power {
    private int kick;
    private int punch;

    public Power() {
        kick = 100;
        punch = 100;
        System.out.println("kick = " + kick);
        System.out.println("punch = " + punch);
    }

    public Power(int kick, int punch) {
        this.kick = kick;
        this.punch = punch;
        System.out.println("kick = " + this.kick);
        System.out.println("punch = " + this.punch);
    }



}

class PowerTest {
    public static void main(String[] args) {

    }
}
