package First_Java.ch08_polymorphism_and_innerClass.nonEnum;

class Status {
    // 변수의 이름은 의미있지만 값 자체는 의미가 없음.
    public static final int READY = 1;
    public static final int SEND = 2;
    public static final int COMPLETE = 3;
    public static final int CLOSE = 4;
}

public class NonEnumTest {
    public static void main(String[] args) {
        int work = 0;
        int n = 2;

        switch (n) {
            case 1:
                work = Status.READY;
                break;
            case 2:
                work = Status.SEND;
                break;
            case 3:
                work = Status.COMPLETE;
                break;
            case 4:
                work = Status.CLOSE;
                break;
        }
    }
}
