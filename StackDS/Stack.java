package StackDS;

public class Stack {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long item) {
        if (isFull()) {
            System.out.println("Stack is full unable to add data");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public long pop() {
        if (isEmpty()) {
            System.out.println("stack is already empty");
            return -1;
        } else {
            int old_top = top;
            top--;
            return stackArray[old_top];
        }
    }

    public void print() {
        for (int i = top ; i >= 0; i--) {
            System.out.print(stackArray[i]);
        }
    }

    public void println() {
        for (int i = top ; i >= 0; i--) {
            System.out.println(stackArray[i]);
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize - 1  == top;
    }
}
