package first_java.ch07_inheritatnce;

public class Professor extends Person {
    private String subject;

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
