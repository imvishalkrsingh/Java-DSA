package Backtracking;
import java.util.Scanner;

public class ChangeArray {

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void changeArr(int arr[], int i, int val) {
        //base case
        if(i == arr.length) {
            printArr(arr);
            return;
        }

        //recursion
        arr[i] = val;
        changeArr(arr, i+1, val+1); //fnx call step
        arr[i] = arr[i]-2;  //backtracking step
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("These are the Changed Arrays : ");
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}
