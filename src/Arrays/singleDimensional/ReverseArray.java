package Arrays.singleDimensional;
import java.util.Scanner;

public class ReverseArray {

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] reverseArray = new int[n];

        // Fix the loop range: it should go from n-1 to 0
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = arr[i]; // Copy elements in reverse order
        }

        return reverseArray;
    }

    public static void reverseOfArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while (start < end){
            // Swap

            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
        System.out.println("Here is the reverse of Array through swap function : ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of array : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Print the reversed array directly
        System.out.println("Here is the Reverse of the Array directly from LOOP : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Add a line break

        int[] reversed = reverseArray(array); // Call the reverseArray function

        System.out.println("Here is the Reverse Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(reversed[i] + " ");
        }
        System.out.println();

        reverseOfArray(array);
    }
}
