package jungsuk_of_java.ch14_stream;

import java.util.Comparator;
import java.util.stream.Stream;


public class SortedComparingEx {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("안자바", 2, 100),
                new Student("박자바", 2, 150),
                new Student("소자바", 1, 200),
                new Student("나자바", 3, 290),
                new Student("감자바", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

        /* 실행 결과
            [김자바, 1, 200]
            [소자바, 1, 200]
            [박자바, 2, 150]
            [안자바, 2, 100]
            [이자바, 3, 300]
            [나자바, 3, 290]
            [감자바, 3, 180]
         */
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student student) { // 총점 내림차순을 기본정렬로 한다.
        return student.totalScore - this.totalScore;
    }

    @Override
    public String toString() {
        return String.format("[%s, %d, %d]", name, ban, totalScore);
    }
}
