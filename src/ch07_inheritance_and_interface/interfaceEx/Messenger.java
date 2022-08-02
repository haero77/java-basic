package ch07_inheritance_and_interface.interfaceEx;

public interface Messenger {

    public static final int MIN_SIZE = 1; // 'public static final' 생략시 자동으로 추가
    public static final int MAX_SIZE = 104857600;

    public abstract String getMessage(); // 'abstract' 생략 시 자동으로 추가

    public abstract void setMessage(String msg);

    // default 메서드 : 인터페이스를 사용하는 모든 클래스에서 공통으로 갖는 기능을 구현
    default void setLogin(boolean login) {
        log();
        if (login) {
            System.out.println("로그인 처리합니다.");
        } else {
            System.out.println("로그아웃 처리합니다.");
        }
    }

    // static 메서드 : 인터페이스를 구현하는 모든 객체에서 자주 사용하는 유용한 기능을 제공
    public static void getConnection() {
        System.out.println("network에 연결합니다.");
    }

    // private 메서드 : 동일한 인터페이스에 선언된 default 메서드에서만 사용할 목적으로 본문을 구현하는 메서드
    private void log() {
        System.out.println("start job!");
    }
}



