package ch07_inheritance_and_interface.interfaceEx;

public class MessengerTest {
    public static void main(String[] args) {

        IPhoneMessenger iphone = new IPhoneMessenger();
        GalaxyMessenger galaxy = new GalaxyMessenger();

        System.out.println("메신저 최소 문자크기 : " + Messenger.MIN_SIZE);
        System.out.println("메신저 최대 문자크기 : " + Messenger.MAX_SIZE);

        iphone.setLogin(true);
        iphone.getMessage();
        iphone.setMessage("hello");
        iphone.clearMessage();

        galaxy.setLogin(true);
        galaxy.getMessage();
        galaxy.setMessage("hi");
        galaxy.changeKeyboard();
    }
}
