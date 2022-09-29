package jungsuk_of_java.ch14_lambda;

public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b; // 람다식, 익명 객체
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b ? a : b;
            }
        };

//        int value = obj.max(3, 4); // 함수형 인터페이스 필요
        
        // 익명 클래스를 사용하여 인터페이스 구현
        MyFunction3 myFunction = new MyFunction3() {
            @Override
            public int max(int a, int b) { // 오버라이딩 접근 제어자는 좁게 못 바꾼다. 
                return a > b ? a : b;
            }
        };
        System.out.println(myFunction.max(3, 5));

        // 람다식을 사용하여 인터페이스 구현
        // 람다식(익명 객체)을 다루기 위한 참조 변수의 타입은 함수형 인터페이스로 한다.
        MyFunction3 myFunction2 = (a, b) -> a > b ? a : b;
        System.out.println(myFunction2.max(5, 3));
    }
}

@FunctionalInterface
interface MyFunction3 {
    int max(int a, int b);
}