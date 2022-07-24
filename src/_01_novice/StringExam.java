package _01_novice;

public class StringExam {

    public static void main(String[] args) {
        String str1 = "hello"; // 메서드 영역에 객체(리터럴) 생성
        String str2 = "hello";
        String str3 = new String("hello"); // 힙 영역에 객체 생성
        String str4 = new String("hello");

        if (str1 == str2) {
            System.out.println("str1과 str2는 같은 객체를 참조한다.");
        } else {
            System.out.println("str1과 str2는 다른 객체를 참조한다.");
        }

        if (str1 == str3) {
            System.out.println("str1과 str3은 같은 객체를 참조한다.");
        } else {
            System.out.println("str1과 str3은 다른 객체를 참조한다.");
        }

        if (str3 == str4) {
            System.out.println("str3과 str4는 같은 객체를 참조한다.");
        } else {
            System.out.println("str3과 str4는 다른 객체를 참조한다.");
        }

        if (str3.equals(str4)) {
            System.out.println("str3과 str4가 참조하는 객체의 값은 같다.");
        } else {
            System.out.println("str3과 str4가 참조하는 객체의 값은 다르다.");
        }

        System.out.println("str1 hashcode: " + System.identityHashCode(str1)); // 985922955
        System.out.println("str2 hashcode: " + System.identityHashCode(str2)); // 985922955
        System.out.println("str3 hashcode: " + System.identityHashCode(str3)); // 586617651
        System.out.println("str4 hashcode: " + System.identityHashCode(str4)); // 328638398
    }
}

/*
    (실행 결과)
    str1과 str2는 같은 객체를 참조한다.
    str1과 str3은 다른 객체를 참조한다.
    str3과 str4는 다른 객체를 참조한다.
    str3과 str4가 참조하는 객체의 값은 같다.
    str1 hashcode: 985922955
    str2 hashcode: 985922955
    str3 hashcode: 586617651
    str4 hashcode: 328638398
 */
