package jungsuk_of_java.ch14_lambda;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceEx {
    public static void main(String[] args) {
        Function<String, Integer> toIntegerByLambda = (str) -> Integer.parseInt(str); // 람다식을 이용한 구현
        Function<String, Integer> toIntegerByMethodReference = Integer::parseInt; // 메서드 참조

        System.out.println("500" + 500);
        System.out.println(toIntegerByLambda.apply("500") + 500);
        System.out.println(toIntegerByMethodReference.apply("500") + 500);

        // 생성자의 메서드 참조
        Supplier<SampleClass> sampleClassSupplierByLambda = () -> new SampleClass(); // 생성자를 호출하는 람다식
        Supplier<SampleClass> sampleClassSupplierByMethodReference = SampleClass::new; // 생성자를 호출하는 람다식 역시 메서드 참조로 변환 가능하다.

        System.out.println(sampleClassSupplierByLambda.get());

        // 매개변수가 있는 생성자라면 매개변수의 개수에 따라 적절한 함수형 인터페이스를 사용한다.
        BiFunction<String, Integer, SampleClass2> sampleClass2SupplierByLambda = (name, age) -> new SampleClass2(name, age);
        BiFunction<String, Integer, SampleClass2> sampleClass2SupplierByMethodReference = SampleClass2::new;
        System.out.println(sampleClass2SupplierByLambda.apply("샘플 이름", 27).name);
        System.out.println(sampleClass2SupplierByMethodReference.apply("샘플 이름", 35).age);

//        Function<Integer, int[]> f = size -> new int[size];
        Function<Integer, int[]> f = int[]::new;
    }
}

class SampleClass {

}

class SampleClass2 {
    String name;
    int age;

    public SampleClass2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}