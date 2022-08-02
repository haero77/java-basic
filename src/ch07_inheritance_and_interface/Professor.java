package ch07_inheritance_and_interface;

public class Professor extends Person {
    private String subject;

    public Professor() {
        System.out.println("Professor 생성자 실행!");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() { // Person 클래스의 toString() 메서드 오버라이딩
        return this.getName() + ":" + this.getAge() + ":" + subject;
    }
}
