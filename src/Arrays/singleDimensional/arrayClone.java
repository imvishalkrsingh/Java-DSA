package Arrays.singleDimensional;

import java.util.Arrays;
import java.util.Scanner;
public class arrayClone {

    static void printArray(int[] arr){

        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] original_array = new int[size];

        System.out.print("Enter array elements : ");
        for (int i = 0; i < original_array.length; i++){
            original_array[i] = sc.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(original_array);


//        array cloning

        int[] cloneArray = original_array;

        System.out.println("Clone Array : ");
        printArray(cloneArray);

        Arrays.sort(cloneArray);

        System.out.print("Sort an Array : ");
        for (int num : cloneArray) {
            System.out.print(num + " ");
        }

    }
}
