package syntax;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {1, -1};

        arr = sortedArr(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    private static int[] sortedArr(int[] arr, int length) {

        int count = 0;
        int temp = 0;

        if (length == 1) {
            return arr;
        }

        for (int i = 1; i < length; i++) {
            if (arr[i - 1] > arr[i]) {
                temp = arr[i - 1];
                arr[i - 1] = arr[i];
                arr[i] = temp;
                count++;
            }
        }

        // if array does not have to be sorted
        if (count == 0) {
            return arr;
        }

        sortedArr(arr, length - 1);
        return arr;
    }

}
