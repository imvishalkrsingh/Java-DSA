package Arrays;
import java.util.Scanner;

// Q. write a program to count an Occurrences of a number in an array
public class occurrences {

    static int countOccurrences(int[] arr, int x){
        int count = 0;
        for(int i = 0 ; i < arr.length; i++){
           if(arr[i] == x){
               count ++;
           }
           else if (a)
        }
        return count;
    }


//    Make a class to check last occurrences of a number in an array.

    static int lastOccurrences(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
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

        System.out.println("Occurrence of " + x + " is : " + countOccurrences(array, x));

        System.out.println("Last Occurrences of " + x + " is : " + lastOccurrences(array,x));
    }
}
