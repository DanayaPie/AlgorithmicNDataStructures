package syntax.Java.Algorithm.Sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {9, 3, -2, 1, 10};

        quickSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr) {

        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // partition the arr and return the new pivotInd
            int pivotInd = partition(arr, low, high);

            quickSort(arr, low, pivotInd - 1);
            quickSort(arr, pivotInd + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        // choose random ind btw low and high as pivot and swap pivot with high
        int pivotInd = new Random().nextInt((high - low) + low);
        int pivot = arr[pivotInd]; // pivot element
        swap(arr, pivotInd, high);

        int leftPointer = low;
        int rightPointer = high;

        /*
            this while loop will move the leftPointer and rightPointer closer to each other and swap the element if necessary
         */
        while (leftPointer < rightPointer) {

            // increment leftPointer until the value at leftPointer is greater than the pivot
            // while leftPointer must be less than right pointer
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }

            // increment rightPointer until the value at rightPointer is less than the pivot
            // while rightPointer must be greater than right pointer
            while (arr[rightPointer] >= pivot && rightPointer > leftPointer) {
                rightPointer--;
            }

            // swap the 2 elements once leftPointer ele is greater than pivot and right ele is less than pivot
            swap(arr, leftPointer, rightPointer);
        }

        // swap the pivot ele with the ele that the leftPointer and rightPointer meet
        // high index is the pivot ele
        swap(arr, leftPointer, high);

        return leftPointer;
    }

    private static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
