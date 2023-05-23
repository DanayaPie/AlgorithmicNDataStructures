package syntax.Java.Algorithm;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {-8, 13, -14, 1};

        arr = (selectionSort(arr, arr.length, 0));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int[] selectionSort(int[] arr, int length, int index) {
        int temp = 0;

        if (index == length) {
            return arr;
        }

        // get index of smallest element - recursive minIndex
        // **can use iteration instead
        int k = minIndex(arr, length - 1, index);

        // swap current index to the index of smallest element
        if (k != index) {
            temp = arr[k];
            arr[k] = arr[index];
            arr[index] = temp;
        }

        selectionSort(arr, length, index + 1);
        return arr;
    }

    // fibonacci sequence (recursive minIndex)
    private static int minIndex(int[] arr, int length, int index) {

        // largest possible index - stop calling minIndex method
        if (index == length) {
            return index;
        }

        // k = index of smallest (start from largest index)
        int k = minIndex(arr, length, index + 1);

        // ternary operator: true, return index, false return k -> get index of smallest element
        return (arr[index] < arr[k]) ? index : k;
    }
}
