package Arrays.singleDimensional;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MaxSubArray {

    public static void maxSubArraySum(int[] arr){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int end;
            for (int j = i; j < arr.length; j++) {
                end = j;
                currSum = 0;

                for (int k = start; k <= end; k++){
                    currSum += arr[k];
                }

                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int [] array = new int[size];
        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }



        maxSubArraySum(array);
    }
}