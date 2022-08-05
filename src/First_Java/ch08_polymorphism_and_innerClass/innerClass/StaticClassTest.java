package First_Java.ch08_polymorphism_and_innerClass.innerClass;

public class StaticClassTest {
    public static void main(String[] args) {

        // static 클래스의 인스턴스 생성
        OuterClass.staticClass staticInner = new OuterClass.staticClass();

        // static 클래스의 인스턴스 멤버 사용 - static클래스 객체의 참조변수로 접근
        staticInner.instanceField = 1500;
        staticInner.instanceMethod();

        // static 클래스의 static 멤버 사용 - 외부클래스로 접근
        OuterClass.staticClass.staticField = 3000;
        OuterClass.staticClass.staticMethod();
    }
}
