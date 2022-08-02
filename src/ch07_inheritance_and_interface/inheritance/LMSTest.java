package ch07_inheritance_and_interface.inheritance;

public class LMSTest {
    public static void main(String[] args) {
        Employee e = new Employee();
        Professor p = new Professor();

        e.setName("오정임");
        e.setAge(47);
        e.setDept("입학처");

        p.setName("김푸름");
        p.setAge(52);
        p.setSubject("빅데이터");

        System.out.println(e.toString());
        System.out.println(p.toString());
    }
}
