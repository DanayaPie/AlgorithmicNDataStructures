package syntax.Java;

public class InsertionSortIterative {
    public static void main(String[] args) {
        int[] arr = {18, 9, -11, 0};

        arr = insertionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // current
            int j = i - 1; // last value in sorted subset

            System.out.println("key: " + key);
            System.out.println("i: " + i);
            System.out.println("j: " + j);

            // if last val in sorted subset > current, continue to replace the val at current
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
