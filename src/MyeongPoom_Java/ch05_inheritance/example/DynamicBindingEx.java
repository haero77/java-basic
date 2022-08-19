package MyeongPoom_Java.ch05_inheritance.example;

class SuperObject {
    public void paint() {
        draw();
    }

    public void draw() {
        draw(); // subObject 인스턴스에서 호출된다면 동적 바인딩으로 인해 subOjbect에 오버라이딩된 draw(); 호출. 재귀 호출이 아니다.
        System.out.println("SuperObject");
    }
}

class SubObject extends SuperObject {
    @Override
    public void paint() {
        super.draw();
    }

    @Override
    public void draw() {
        System.out.println("SubObject");
    }
}

public class DynamicBindingEx {
    public static void main(String[] args) {
        SubObject sub = new SubObject();
        sub.paint();
    }
}
