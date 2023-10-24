package Recursion;
import java.util.Scanner;

public class LastOccurrence {

    public static int lastOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        int isFound = lastOccurrence(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter Key value : ");
        int key = sc.nextInt();

        System.out.print("Enter i : ");
        int i = sc.nextInt();

        int result = lastOccurrence(array, key, i);

        if (result == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Last occurrence of key is at index: " + result);
        }
    }
}
