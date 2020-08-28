package sorts;

public class InsertionSort {

    public static void main(String[] args) {
        int[] result = insertionSort(new int[]{45, 2, 76, 5, 23, 90, 1});
        print(result);

    }

    public static void print(int[] a) {
        for(int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] insertionSort(int[] a) {

        for(int i = 1; i < a.length; i++) {
            int element = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > element) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = element;
        }

     return a;
    }
}
