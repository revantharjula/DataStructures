package QueueDS;

import org.w3c.dom.Node;

public class Queue {

    private int rear;
    private int front;
    private long[] queueArray;
    private int maxSize;
    private int nItems;

    public Queue(int size) {
        this.nItems = 0;
        this.rear = -1;
        this.front = 0;
        this.maxSize = size;
        this.queueArray = new long[size];
    }

    public void insert(long i) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        rear++;
        queueArray[rear] = i;
        nItems++;

    }

    public long remove() {
        long temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < queueArray.length; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }

    private boolean isFull() {
        return nItems == maxSize;
    }

    private boolean isEmpty() {
        return nItems == 0;
    }


}

