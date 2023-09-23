package Arrays;
import java.util.Scanner;
public class ReverseArray {

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int [] reverseArray = new int[n];

        for(int i = n; i > 0; i--){
            System.out.println(arr[i]);
        }

        return reverseArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of array : ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        for (int i = 0; i < size; i ++){
            System.out.print(array[i] + " ");
        }

        System.out.println("Here is the Reverse Array : " + reverseArray(array));
    }
}
