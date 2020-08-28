package Algorithms.Recursion;

public class RecursiveSearch {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(recursiveLinearSearch(new int[] {3, 56, 73, 90, 63, 19}, 0, 19));
        System.out.println(recursiveBinarySearch(new int[] {3, 5, 7, 9, 11, 14, 18, 21}, 0, 7, 3));
    }

    public static int recursiveLinearSearch(int[] a, int i, int x) {
        if (i > a.length -1) {
            return -1;
        } else if (a[i] == x){
            return i;
        } else {
            System.out.println("Index value is at " + i);
            return recursiveLinearSearch(a, ++i, x);
        }
    }

    public static int recursiveBinarySearch(int[] a, int p, int r, int x) {
        if (p > r) {
            return -1;
        } else {
            int q = (p + r)/2;
            if(a[q] == x) {
                return q;
            } else if(a[q] > x) {
                return recursiveBinarySearch(a, p, q-1, x);
            } else {
                return recursiveBinarySearch(a, q+1, r, x);
            }
        }
    }
}
