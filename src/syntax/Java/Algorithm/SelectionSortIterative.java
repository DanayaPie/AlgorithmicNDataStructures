package syntax.Java.Algorithm;

public class SelectionSortIterative {

    public static void main(String[] args) {
        int[] arr = {-55, 95, 21, -9, 3};

        arr = selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] selectionSort(int[] arr) {

        int pos = 0;
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            pos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[pos]) {
                    pos = j;
                }
            }

            temp = arr[pos];
            arr[pos] = arr[i]; // reset pos to i
            arr[i] = temp;
        }
        return arr;
    }
}
