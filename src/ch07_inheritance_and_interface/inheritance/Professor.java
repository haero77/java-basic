package ch07_inheritance_and_interface.inheritance;

public class Professor extends Person {
    private String subject;

    public Professor() {
        // super()
        System.out.println("Professor 생성자 실행!");
    }

    public Professor(String name, int age, String subject) {
        // super() 문을 명시했으므로, 컴파일러가 자동으로 super()를 추가하지 않는다.
        super(name, age); // 부모클래스의 Person(name, age) 생성자 호출.
        this.subject = subject;
        System.out.println("Professor(name, age, subject) 생성자 실행!");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() { // Person 클래스의 toString() 메서드 오버라이딩
        return super.toString() + subject;
    }
}
