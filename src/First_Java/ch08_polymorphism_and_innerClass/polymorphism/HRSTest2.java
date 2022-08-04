package First_Java.ch08_polymorphism_and_innerClass.polymorphism;

public class HRSTest2 {

    public static void calcTax(Employee e) {
        if (e instanceof Salesman) { // e가 참조하는 인스턴스의 타입이 Salesman
            Salesman s = (Salesman) e; // 타입 변경 (메모리에 생성되어 있는 타입만 가능. Salesman, Employee, Object)
            s.annual_sales = 6500000;
            System.out.println("Salesman 입니다." + s.annual_sales);
        } else if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.num_team = 5;
            System.out.println("Manager 입니다." + m.num_team);
        } else if (e instanceof Consultant) {
            Consultant c = (Consultant) e;
            c.num_project = 35;
            System.out.println("Consultant 입니다." + c.num_project);
        } else {
            System.out.println("Employee 입니다.");
        }
    }

    public static void main(String[] args) {
        Salesman s = new Salesman();
        Manager m = new Manager();
        Consultant c = new Consultant();

//        Employee s2 = new Salesman();
//        Director d = new Director(); // Manager 클래스의 자식 클래스

        calcTax(s); // Salesman 입니다.
        calcTax(m); // Manager 입니다.
        calcTax(c); // Consultant 입니다.
//        calcTax(s2); // Salesman 입니다.
//        calcTax(d); // Manager 입니다.
    }
}


