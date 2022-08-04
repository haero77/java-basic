package First_Java.ch07_inheritance_and_interface.inheritance;

public class LMSTest2 {
    public static void main(String[] args) {
        Employee e = new Employee("오정임", 47, "입학처");
        Professor p = new Professor("김푸름", 52, "빅데이터");

        System.out.println(e.toString());
        System.out.println(p.toString());
    }
}
