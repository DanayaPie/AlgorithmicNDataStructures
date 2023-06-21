package syntax.Java.Algorithm.Sorting;

import java.util.Arrays;

public class SelectionSortIterative {

    public static void main(String[] args) {
        int[] arr = {-55, 95, 21, -9, 3};

        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minInd]) {

                    minInd = j;
                }
            }

            int temp = arr[minInd];
            arr[minInd] = arr[i];
            arr[i] = temp;

        }
    }
}
