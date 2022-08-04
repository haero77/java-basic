package First_Java.ch08_polymorphism_and_innerClass.innerClass;

public class MyLinkedList {

    private Node head = null;

    private class Node { // 내부 클래스
        private String data;
        private Node link;

        public Node(String data) { // 생성자
            this.data = data;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node next = head;
            while (next.link != null) {
                next = next.link;
            }
            next.link = newNode;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("등록된 데이터가 없습니다");
        } else {
            System.out.println("등록된 데이터는 다음과 같습니다");
            Node next = head;
            while (next != null) {
                System.out.println(next.data);
                next = next.link;
            }
        }
    }
}
