package first_java.ch06_OOP_implementation;

/* 생성자 실행 예제 */
public class Member {
    private String name;
    private int age;

    public Member() { // 기본 생성자(매개변수가 없는 생성자)
        System.out.println("Member() 생성자 실행");
    }

    public Member(String name) { // 생성자 오버로딩
        System.out.print("Member(String) 생성자 실행 : ");
        System.out.println(name);
    }

    public Member(String name, int age) { // 생성자 오버로딩
        System.out.print("Member(String, int) 생성자 실행 : ");
        System.out.println(name + " : " + age);
    }

    public void setName(String name) {
    }

    public static void main(String[] args) {
        System.out.println("main() 메서드 실행");
        new Member(); // 힙 메모리에 Member 클래스의 인스턴스 생성(필드 생성)이후, Member() 생성자 호출
        new Member("Amy");
        new Member("Amy", 23);
    }
}
