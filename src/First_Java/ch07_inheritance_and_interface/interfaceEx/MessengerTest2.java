package First_Java.ch07_inheritance_and_interface.interfaceEx;

public class MessengerTest2 {
    public static void main(String[] args) {

        GalaxyMessenger galaxy = new GalaxyMessenger();
        IPhoneMessenger iphone = new IPhoneMessenger();

        galaxy.fileUpload();
        galaxy.fileDownload();

        iphone.draw_textBox();
        iphone.draw_submitButton();
    }
}
