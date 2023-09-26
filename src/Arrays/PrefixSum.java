package Arrays;
import java.util.Scanner;

public class PrefixSum {

    static void printArray(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int[] prefixSumArray(int[] arr){
        int n = arr.length;
        int [] pref = new int[n];

        pref[0] = arr[0];
        for(int i = 1; i < n; i++){
            pref[i] = pref[i-1] + arr[i];
        }
        return pref;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        printArray(array);

        int [] pref = prefixSumArray(array);

        System.out.println("Prefix Sum Array : ");

        printArray(pref);

    }

}
