package First_Java.ch07_inheritance_and_interface;

public class Person { // 부모 클래스
    private String name;
    private int age;

    public Person() {
        System.out.println("Person 생성자 실행!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}
