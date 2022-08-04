package First_Java.ch08_polymorphism_and_innerClass.innerClass;

public class MyLinkedListTest {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        myList.print();

        myList.add("JAVA");
        myList.add("JSP");
        myList.add("Servlet");
        myList.print();
    }
}
