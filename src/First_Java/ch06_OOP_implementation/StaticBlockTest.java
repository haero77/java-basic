package First_Java.ch06_OOP_implementation;

public class StaticBlockTest {
    // 정적 블록. main() 메서드가 실행되기 전에 딱 한 번 실행된다.
    static {
        System.out.println("hello");
        System.out.println("java");
    }

    public static void main(String[] args) {
        System.out.println("world!");
    }
}

/*
    (실행 결과)
    hello
    java
    world!
 */
