package First_Java.ch07_inheritance_and_interface.inheritance;

public class Employee extends Person {
    private String dept;

public Employee() {
    System.out.println("Employee 생성자 실행!");
}

    public Employee(String name, int age, String dept) {
        super(name, age); // 부모클래스의 Person(name, age) 생성자 호출.
        this.dept = dept;
        System.out.println("Employee(name, age, dept) 생성자 실행!");
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() { // 부모 클래스 Person의 toString() 메서드 오버라이딩
        return super.toString() + ":" + dept;
    }
}
