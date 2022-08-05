package First_Java.ch08_polymorphism_and_innerClass.anonymousClass;

public class MessengerTest {
    public static void main(String[] args) {
        /* 일반 클래스의 인스턴스 생성과 사용 */
        GalaxyMessenger galaxy = new GalaxyMessenger();
        System.out.println(galaxy.getMessage());
        galaxy.setMessage("Hi, I'm Galaxy.");
        galaxy.changeKeyboard();

        /* 익명 클래스의 선언과 사용 */
        Messenger anonymousTest = new Messenger() { // 익명 클래스 선언

            @Override
            public String getMessage() { // 인터페이스 메서드 오버라이딩
                return "anonymousTest";
            }

            @Override
            public void setMessage(String msg) { // 인터페이스 메서드 오버라이딩
                System.out.println("anonymousTest에서 메시지를 설정합니다: " + msg);
            }
        };

        // 익명 클래스의 멤버 사용
        System.out.println(anonymousTest.getMessage());
        anonymousTest.setMessage("Have a nice day!");
    }
}
