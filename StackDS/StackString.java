package StackDS;

public class StackString {

    private int top;
    private char[] stackArray;
    private int maxSize;

    public StackString(int size) {
        this.maxSize = size;
        this.stackArray = new char[maxSize];
        this.top = -1;
    }

    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is full unable to add data");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("stack is already empty");
            return ' ';
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

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize - 1  == top;
    }
}
