package LinkedListDS;

public class App {
    public static void main(String[] args) {
//        SinglyLinkedList s = new SinglyLinkedList();
//        s.insertFirst(23);
//        s.insertFirst(34);
//        s.insertFirst(45);
//        s.insertFirst(56);
//        s.insertLast(67);
//
//        s.displayList();
//
//        s.removeFirst();
//
//        s.displayList();
//
//        s.insertFirst(56);
//
//        s.displayList();

        CircularLinkedList c = new CircularLinkedList();
        c.insertFirst(10);
        c.insertFirst(20);
        c.insertFirst(30);

        c.displayList();

        c.insertLast(40);

        c.displayList();

        c.deleteFirst();

        c.displayList();





    }
}
