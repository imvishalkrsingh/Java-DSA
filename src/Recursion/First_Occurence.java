package Recursion;
import java.util.Scanner;
public class First_Occurence {

    public static int firstOccurance(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurance(arr, key, i+1);
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

        System.out.print("Enter Key : ");
        int key = sc.nextInt();

        System.out.print("Enter i : ");
        int i = sc.nextInt();


        System.out.print("Elements found at : ");
        System.out.println(firstOccurance(array, key, i));


    }

}
