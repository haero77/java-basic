package First_Java.ch08_polymorphism_and_innerClass.polymorphism;

public class HRSTest_Array {
    public static void main(String[] args) {
        Salesman s1 = new Salesman();
        Employee s2 = new Salesman();
        Object s3 = new Salesman();

        Object m1 = new Manager();
        Employee m2 = new Manager();
        Manager m3 = new Manager();
//        Director m4 = new Manager(); // 오류. 자손 타입의 참조변수에 부모의 주소 저장 불가능.

        Object[] arr = new Object[6];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        arr[3] = m1;
        arr[4] = m2;
        arr[5] = m3;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
