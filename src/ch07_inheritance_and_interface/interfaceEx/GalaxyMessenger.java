package ch07_inheritance_and_interface.interfaceEx;

public class GalaxyMessenger implements Messenger, WorkFile{
    public String getMessage() { // Messenger 인터페이스 메서드 오버라이딩
        return "galaxy";
    }

    public void setMessage(String msg) { // Messenger 인터페이스 메서드 오버라이딩
        System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
    }

    public void fileUpload() { // WorkFile 인터페이스 오버라이딩
        System.out.println("file을 업로드합니다.");
    }

    public void fileDownload() { // WorkFile 인터페이스 오버라이딩
        System.out.println("file을 다운로드합니다.");
    }

    public void changeKeyboard() {
        System.out.println("키보드아이콘 터치 후 키보드를 변경합니다.");
    }
}
