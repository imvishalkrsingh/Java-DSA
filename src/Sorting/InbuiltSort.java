/*
Arrays.sort() method in which we do not pass any arguments
where it sorts down the complete array be it integer array
or character array, but if we are supposed to sort a specific
part using this method of Arrays class then we overload it
and pass the starting and last index to the array.
 */

package Sorting;
import java.util.Scanner;
import java.util.Arrays;
public class InbuiltSort {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of elements : ");
        int size = sc.nextInt();

        int array[] = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the sorted elements by Inbuilt Sort : ");
        Arrays.sort(array);
        printArray(array);

        int[] array1 = {5,4,1,3,2,0};
        System.out.println("Sort specific part of array : ");
        Arrays.sort(array1, 0,3);
        printArray(array1);
    }
}
