package Arrays;
import java.util.Scanner;
public class EqualSumPartition {

    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static int findArraySum(int[] arr){
        int n = arr.length;

        int totalSum = 0;

        for (int i = 0; i < n; i++){
            totalSum = totalSum + arr[i];
        }
        return totalSum;
    }

    static boolean equalsumPartition(int [] arr){
        int totalSum = findArraySum(arr);

        int prefSum = 0;

        for(int i = 0; i < arr.length; i++){
            prefSum = prefSum + arr[i];      // prefsum += arr[i];

            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        printArray(array);


        System.out.println("Equal partition possible : " + equalsumPartition(array));
    }
}
