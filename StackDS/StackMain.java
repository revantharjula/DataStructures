package StackDS;

public class StackMain {
    public static void main(String[] args) {
        Stack s = new Stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        //s.push(40);
        //s.push(50);
        System.out.println(s.isFull());
        s.print();

        StackString ss = new StackString(5);
        ss.push('H');
        ss.push('E');
        ss.push('L');
        ss.push('L');
        ss.push('O');
        System.out.println(ss.isFull());
        ss.print();

         System.out.println(reverseString("Revanth"));

    }

    public static String reverseString(String str) {
        int size = str.length();
        String result = "";
        StackString s = new StackString(size);
        for (int i = 0; i < size; i++) {
            s.push(str.charAt(i));
        }
        while(!s.isEmpty()) {
           result = result + s.pop();
        }
        return result;
    }





}
