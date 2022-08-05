package First_Java.ch08_polymorphism_and_innerClass.anonymousClass;

public class GalaxyMessenger implements Messenger{
    public String getMessage() { // Messenger 인터페이스의 메서드 구현
        return "galaxy";
    }

    public void setMessage(String msg) { // Messenger 인터페이스의 메서드 구현
        System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
    }

    public void changeKeyboard() {
        System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
    }
}
