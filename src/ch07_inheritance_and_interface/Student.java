package ch07_inheritance_and_interface;

public class Student extends Person {
    private String major;

    public Student() {
        System.out.println("Student 생성자 실행!");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String toString() { // 부모 클래스의 toString() 메서드 오버라이딩
        return this.getName() + ":" + this.getAge() + ":" + major;
    }
}
