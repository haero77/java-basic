package jungsuk_of_java.ch14_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationEx {
    public static void main(String[] args) {
        // 컬렉션을 소스로 하여 스트림을 생성
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); //  가변인자
        Stream<Integer> intStream = list.stream(); // list를 소스로 하는 스트림 생성
        intStream.forEach(System.out::println);
//        intStream.forEach(System.out::println); // 에러. 스트림이 이미 닫혔다. 최종연산은 한 번만 사용가능

        // 배열을 소스로 하여 스트림 생성
        Stream<String> strStream1 = Stream.of("a", "b", "c");
        Stream<String> strStream2 = Stream.of(new String[]{"a", "b", "c"});
        Stream<String> strStream3 = Arrays.stream(new String[]{"a", "b", "c"});
        Stream<String> strStream4 = Arrays.stream(new String[]{"a", "b", "c"}, 0, 3); // (source, startInclusive, endExclusive)

        // 기본형 배열을 소스로 하여 스트림 생성
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        IntStream intStream2 = Arrays.stream(intArr);
        System.out.println(intStream2.sum());
    }
}
