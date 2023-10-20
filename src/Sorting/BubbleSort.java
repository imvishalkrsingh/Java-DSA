package Sorting;
import java.util.Scanner;
public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for (int turn = 0; turn < arr.length-1; turn++){
            for (int j = 0; j < arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int array [] = new int[size];

        System.out.println("Enter " + size +" Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("This is the original Array : ");
        printArray(array);

        System.out.println("This is sorted array by Bubble Sort : ");
        bubbleSort(array);
        printArray(array);




    }
}
