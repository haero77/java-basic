package jungsuk_of_java.ch14_stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatmapEx {
    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "ghi"},
                new String[]{"ABC", "GHI", "JKLMN"}
        );

        // Stream<String[]> -> Stream<Stream<String>>
//        Stream<Stream<String>> strStrStream = strArrStream.map(Arrays::stream); // 스트림의 스트림

        // Stream<String[]> -> Stream<String>
        Stream<String> strStream = strArrStream.flatMap(Arrays::stream); // String의 스트림
        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        // 정규식을 이용한 Stream<String> 생성
        String[] lineArr = {
                "Believe of not It is true",
                "Do or do not There is no try"
        };
        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // regex. 빈 칸 하나 이상
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        // 스트림의 스트림을 하나의 스트림으로 합치는 경우(드문 경우이다.)
        Stream<String> strStream1 = Stream.of("AAA", "ABC", "bBb", "Dd");
        Stream<String> strStream2 = Stream.of("bbb", "aaa", "ccc", "dd");

        Stream<Stream<String>> stringStreamStream = Stream.of(strStream1, strStream2);
        Stream<String> stringStream = stringStreamStream
                .map(s -> s.toArray(String[]::new))
                .flatMap(Arrays::stream);
        stringStream.map(String::toLowerCase)
                .distinct()
                .forEach(System.out::println);
    }
}
