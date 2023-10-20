package Sorting;
import java.util.Scanner;
public class InsertionSort {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] arr){
        for (int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Sorted Element by Insertion Sort : ");
        insertionSort(array);
        printArray(array);

    }
}
