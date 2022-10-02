package jungsuk_of_java.ch14_stream;

import java.util.stream.IntStream;

public class StreamIntermediateOperationsEx {
    public static void main(String[] args) {
        // distinct()
        IntStream intStream1 = IntStream.of(1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6);
        intStream1.distinct().forEach(System.out::print); // 123456
        System.out.println();

        // filter
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.filter(i -> i % 2 == 0).forEach(System.out::print); // 246810
        System.out.println();

        intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.filter(i -> i % 2 != 0 && i % 3 != 0).forEach(System.out::print); // 157
        System.out.println();

        intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.filter(i -> i % 2 != 0).filter(i -> i % 3 != 0).forEach(System.out::print); // 157
        System.out.println();
    }
}
