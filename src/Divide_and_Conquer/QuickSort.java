package Divide_and_Conquer;
import java.util.Scanner;

public class QuickSort {

    // Function to print the array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to perform Quick Sort
    public static void quickSort(int arr[], int si, int ei){
        if (si < ei) {
            // Find the partition index
            int pIdx = partition(arr, si, ei);

            // Recursively sort the elements before and after the partition index
            quickSort(arr, si, pIdx-1);   // left part
            quickSort(arr, pIdx+1, ei);
        }
    }

    // Function to partition the array and return the partition index
    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1;  // to make place for elements smaller than pivot

        for (int j = si; j < ei; j++){
            if (arr[j] <= pivot){
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[ei])
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        // Return the partition index
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array:");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("Sorted array by Quick sort:");
        quickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
