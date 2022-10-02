package jungsuk_of_java.ch14_stream;

import java.util.stream.Stream;

public class StreamCreationByLambdaEx {
    public static void main(String[] args) {
        // static<T> Stream<T> iterate(T seed, UnaryOperator<T> f)
        Stream<Integer> evenStream = Stream.iterate(0, n -> n + 2); // 무한 스트림 생성
//        evenStream.forEach(System.out::println); // 0, 2, 4, ... 무한히 출력
        evenStream.limit(10).forEach(System.out::println);

        // static<T> Stream<T> generate(Supplier<T> s)
        Stream<Integer> oneStream = Stream.generate(() -> 1); // 무한 스트림 생성
        oneStream.limit(5).forEach(System.out::print); // 11111
    }
}
