package syntax.Java.Algorithm.Searching;

public class BinarySearchRecursive {
    public static void main(String[] args) {

        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 3;

        int left = 0;
        int right = sortedArray.length-1;

        System.out.println(recursiveBinarySearch(sortedArray, left, right, target));
    }

    public static boolean recursiveBinarySearch(int[] sortedArray, int left, int right, int target) {

        int midpoint = (right+left) /2;

        if (right < left) {
            return false;
        }

        if (target < sortedArray[midpoint]) {
            return recursiveBinarySearch(sortedArray, left, midpoint -1, target);
        }

        if (target > sortedArray[midpoint]) {
            return recursiveBinarySearch(sortedArray, midpoint +1, right, target);
        }

        if (sortedArray[midpoint] == target) {
            return true;
        }
        return false;
    }
}
