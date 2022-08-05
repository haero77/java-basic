package First_Java.ch08_polymorphism_and_innerClass.practice;

public class MyLinkedList {
    private Node head = null;

    private class Node {
        private String data;
        private Node link;

        public Node(String data) {
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
        Node temp = head;

        if (head == null) {
            System.out.println("No Data!!!");
        } else {
            System.out.println("Data Exists");
            while (temp != null) {
                System.out.println(temp.data);
                temp = temp.link;
            }
        }
    }
}
