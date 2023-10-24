package Recursion;
import java.util.Scanner;
public class Check_Sorted {

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length -1){
            return true;
        }

        if(arr[i] > arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.println("Enter " + size + " elements : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println(isSorted(array, 0));;
    }
}
