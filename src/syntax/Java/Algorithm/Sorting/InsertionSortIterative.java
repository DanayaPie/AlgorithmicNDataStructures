package syntax.Java.Algorithm.Sorting;

import java.util.Arrays;

public class InsertionSortIterative {
    public static void main(String[] args) {
        int[] arr = {18, 9, -11, 0};

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // current
            int j = i - 1; // last value in sorted subset

            // if last val in sorted subset > current, continue to replace the val at current
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
