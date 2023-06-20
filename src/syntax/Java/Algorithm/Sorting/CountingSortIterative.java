package syntax.Java.Algorithm.Sorting;

public class CountingSortIterative {

    public static void main(String[] args) {
        // range: 0 - 10
        int[] arr = {0, 1, 9, 1, 2, 9};

        int[] res = countingSort(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    private static int[] countingSort(int[] arr) {

        int range = 10;
        int res[] = new int[arr.length];

        /*  Counting the number of distinct value in the arr input
            and store value at the specific index of count[]
                - count[] size must be the size of the input range
         */
        int count[] = new int[range];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
//        for (int i: arr){ // enhance for loop
//            count[i]++;
//        }

        /*  Set the count[] to contain the last index of each value
            Ex: count[2] = 4 -> last position of 2 is at 4th index
                count[3] = 4 -> repeating value, 3 doesn't exist
         */
        for (int i = 1; i <= range - 1; i++) {
            count[i] += count[i - 1];
        }

        /*  Build the res[] array in reverse of input array
            Ex: res[count[arr[5]] - 1] = arr[5]
                res[count[9] - 1] = 9
                res[6 - 1] = 9
                res[5] = 9
         */
        for (int i = arr.length - 1; i >= 0; i--) {
            res[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        return res;
    }
}
