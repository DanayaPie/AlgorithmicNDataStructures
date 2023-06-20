package syntax.Java.Algorithm.Sorting;

public class BubbleSortIterative {
    public static void main(String[] args) {
        int[] arr = {15, 11, 9, -5, -85};

        arr = sortedArr(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static int[] sortedArr(int[] arr) {

        int temp = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {

                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
