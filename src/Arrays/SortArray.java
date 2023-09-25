package Arrays;
import java.util.Scanner;
public class SortArray {

    // Q. Sort an array consisting only 0s and 1s

    static void printArray(int[] arr){ // method to print array
        int n = arr.length;    // size of an array
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for new line
    }


    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;

        // Count number of zeroes
        for (int i = 0; i < n; i++){
            if(arr[i] == 0){
                zeroes++;
            }
        }

        //print 0 to zeroes -1 : 0 and zeroes to n-1 : 1

        for (int i = 0; i < n; i++){
            if(i < zeroes){
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here Is the Original Array : ");
        printArray(array);

        sortZeroesAndOnes(array);

        System.out.println("Here is the Sorted Array : ");
        printArray(array);

    }
}
