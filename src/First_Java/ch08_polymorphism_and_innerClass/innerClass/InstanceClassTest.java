package First_Java.ch08_polymorphism_and_innerClass.innerClass;

// 인스턴스 멤버 클래스 테스트
public class InstanceClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass(); // 외부 클래스의 인스턴스 생성
        OuterClass.instanceClass inner01 = outer.new instanceClass(); // 인스턴스 멤버 클래스의 인스턴스 생성
        inner01.a = 10;
        inner01.method2();
    }
}
