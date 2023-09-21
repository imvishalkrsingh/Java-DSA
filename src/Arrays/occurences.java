package Arrays;
import java.util.Scanner;

// Q. write a program to count an Occurrences of a number in an array
public class occurences {

    static int countOccurences(int[] arr, int x){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
           if(arr[i] == x){
               count ++;
           }
           else{
               System.out.println("Element not found in the array.");
               break;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of array : ");
        for (int i = 0; i < array.length ; i++){
            array[i] = sc.nextInt();
        }


        System.out.print("Enter the number to Search : ");
        int x = sc.nextInt();

        System.out.println("Occurrence of " + x + " is : " + countOccurences(array, x));
    }
}
