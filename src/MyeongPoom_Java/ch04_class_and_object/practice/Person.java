package MyeongPoom_Java.ch04_class_and_object.practice;

public class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class PersonTest {
    public static void main(String[] args) {
        Person aPerson = new Person();

        aPerson.setAge(27);
        System.out.println(aPerson.getAge());
    }
}
