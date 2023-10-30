package Divide_and_Conquer;
import java.util.Scanner;

public class MergeSort {

    // Method to print an array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function for merge sort
    public static void mergeSort(int arr[], int si, int ei) {
        if (si < ei) {
            // Calculate mid point of array
            int mid = si + (ei - si) / 2;  // (si + ei)/2

            // Recursively sort left and right halves
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);

            // Merge the sorted halves
            merge(arr, si, mid, ei);
        }
    }

    // Merge function to merge two halves of an array
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;  // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0;     // iterator for temp arr

        while (i <= mid && j <= ei) {
            // Compare elements from left and right halves
            // and merge them in sorted order
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of left and right halves
        // if there are any
        while (i <= mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        // Copy temp array back to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main function to test the merge sort algorithm
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Example array to be sorted
//        int arr[] = {6, 3, 9, 5, 2, 8};

        // Call mergeSort to sort the array
        mergeSort(arr, 0, arr.length - 1);

        // Print the sorted array
        printArr(arr);
    }
}
