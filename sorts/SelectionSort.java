package sorts;

public class SelectionSort {
    public static void main(String[] args) {
        int[] result = selectionSort(new int[]{1, 45, 42, 98, 8, 4, 4});
        printArray(result);
    }

    public static void printArray(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static int[] selectionSort(int[] a) {
      for (int i = 0; i < a.length; i++) {
        int min = i;
        for (int j = i + 1; j < a.length; j++) {
          if(a[j] < a[min]) {
            min = j;
          }
        }
        int temp =  a[i];
        a[i] = a[min];
        a[min] = temp;
      }
      return a;

    }
}
