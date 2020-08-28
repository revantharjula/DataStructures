package LinkedListDS;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int a) {
        Node newNode = new Node();
        newNode.data = a;
        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int a) {
        Node newNode = new Node();
        newNode.data = a;
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deleteFirst() {
        Node temp = first;

        if (first.next ==null ) {
            last = null;
        }

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


}
