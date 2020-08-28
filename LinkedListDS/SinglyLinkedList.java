package LinkedListDS;

public class SinglyLinkedList {

    private Node first;


    public void insertFirst(int a) {
       Node newNode = new Node();
       newNode.data = a;
       newNode.next = first;
       first = newNode;
    }

    public Node removeFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last)");
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void insertLast(int a) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = a;
        current.next = newNode;
    }
}
