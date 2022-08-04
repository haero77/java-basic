package First_Java.ch08_polymorphism_and_innerClass;

abstract class Employee { // 클래스가 추상 메서드를 하나라도 포함하면 abstract 키워드를 명시.
    String name;
    int salary;

    public abstract void calcSalary();  // 본문을 구현할 필요가 없는 메서드. 추상 메서드(abstract 메서드)

    public abstract void calcBonus();
}

class Salesman extends Employee {
    public void calcSalary() {
        System.out.println("Salesman 급여 = 기본급 + 판매수당");
    }

    public void calcBonus() {
        System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
    }
}

abstract class Manager extends Employee {
    public void calcSalary() {
        System.out.println("Manager 급여 = 기본급 + 컨설팅 특별 수당");
    }
}

class Consultant extends Employee {
    public void calcSalary() {
        System.out.println("Salesman 급여 = 기본급 + 팀 성과 수당 ");
    }

    public void calcBonus() {
        System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
    }
}

class Director extends Manager {
    public void calcBonus() {
        System.out.println("Director 보너스 = 기본급 * 12 * 6");
    }
}

public class HRSTest_No_Polymorphism {

    // 다형성을 사용하지 않는 경우, 객체의 타입별로 메서드를 오버로딩 해야한다.
    public static void calcTax(Salesman s) {
        // 인자로 전달된 인스턴스의 소득세 계산
    }

    public static void calcTax(Consultant c) {
        // 인자로 전달된 인스턴스의 소득세 계산
    }

    public static void calcTax(Director d) {
        // 인자로 전달된 인스턴스의 소득세 계산
    }

    public static void main(String[] args) {
        Salesman s = new Salesman();
        Consultant c = new Consultant();
        Director d = new Director();

        s.calcBonus();
        c.calcBonus();
        d.calcBonus();
    }
}
