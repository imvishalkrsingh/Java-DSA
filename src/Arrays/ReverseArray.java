package Arrays;
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
        System.out.println("Here is the Reverse of the Array : ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Add a line break

        int[] reversed = reverseArray(array); // Call the reverseArray function

        System.out.println("Here is the Reverse Array : ");
        for (int i = 0; i < size; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
