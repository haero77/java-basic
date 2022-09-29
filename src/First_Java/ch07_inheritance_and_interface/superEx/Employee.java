package First_Java.ch07_inheritance_and_interface.superEx;

public class Employee extends Person {
    private String dept;

    public Employee() {
        System.out.println("Employee 기본 생성자 실행!");
    }

    public Employee(String name, int age, String dept) {
        // super(); // 컴파일러에 의해 자동으로 추가
        super.setName(name);
        super.setAge(age);
        this.dept = dept;
        System.out.println("Employee 생성자 실행!");
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String toString() { // 부모 클래스 Person의 toString() 메서드 오버라이딩
        return this.getName() + ":" + this.getAge() + ":" + dept; // this 키워드를 사용할 수 있는 이유 : Employee 인스턴스가 Person 클래스를 포함하니가
    }
}
