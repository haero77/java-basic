package ch07_inheritance_and_interface.interfaceEx;

public class IPhoneMessenger extends GraphicIOS implements Messenger {

    public String getMessage() { // 오버라이딩
        return "iphone";
    }

    public void setMessage(String msg) { // 오버라이딩
        System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
    }

    public void clearMessage() {
        System.out.println("좌우로 흔들어 문자열을 지웁니다.");
    }
}
