package MyeongPoom_Java.ch05_inheritance.example.UpcastingEx;

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
public class UpcastingEx {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("이재문");
        p = s; // 업캐스팅 (명시적 타입 변환을 하지 않아도 된다.)

        System.out.println(p.name); // 오류 없음.

        // 업캐스팅 하면 업캐스팅한 클래스의 멤버만 접근 가능하다.
        // 즉, 참조변수 p로는 Person클래스의 멤버만 접근 가능하다.
//        System.out.println(p.grade); // 에러 : grade는 Person의 멤버가 아니다.
//        System.out.println(p.department); // 에러 :
    }
}

