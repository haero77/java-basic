package jungsuk_of_java.ch14_stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamMapEx {
    public static void main(String[] args) {
        File[] fileArr = {
                new File("Ex1.java"),
                new File("Ex1.bak"),
                new File("Ex2.java"),
                new File("Ex1"),
                new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        filenameStream.forEach(System.out::println);

        fileStream = Stream.of(fileArr); // 스트림 다시 생성

        // 파일의 확장자만 대문자로 출력
        fileStream.map(File::getName) // Stream<File> -> Stream<String>. getName()이 String을 리턴하기 때문
                .filter(filename -> filename.indexOf(".") != -1)
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .map(String::toUpperCase)
                .distinct()
                .forEach(filename -> System.out.print(filename + ", "));
    }
}
