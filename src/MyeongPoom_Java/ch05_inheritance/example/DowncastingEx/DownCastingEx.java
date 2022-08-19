package MyeongPoom_Java.ch05_inheritance.example.DowncastingEx;

class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class DownCastingEx {
    public static void main(String[] args) {
        Person p = new Student("이재문"); // 업캐스팅 : 자식 클래스의 참조 변수를 부모 클래스 타입으로 변환하는 것
        Student s;
        s = (Student) p; // 다운캐스팅 : 부모클래스 타입의 참조 변수를 자식 클래스 타입으로 타입 변환 하는 것. 명시적 변환 필요

        System.out.println(s.name); // 모든 멤버에 접근 가능
        s.grade = "A"; // 모든 멤버에 접근 가능
    }
}
