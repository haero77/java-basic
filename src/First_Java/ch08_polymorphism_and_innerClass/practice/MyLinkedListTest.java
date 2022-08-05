package First_Java.ch08_polymorphism_and_innerClass.practice;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.print();

        myList.add("Do");
        myList.add("You");
        myList.add("Know Kimchi?");
        myList.print();
    }
}
