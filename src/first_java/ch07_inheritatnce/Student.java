package first_java.ch07_inheritatnce;

public class Student extends Person {
    private String major;

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
