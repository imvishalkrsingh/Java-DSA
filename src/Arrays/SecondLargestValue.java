package Arrays;
import java.util.Scanner;
public class SecondLargestValue {


    static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static int findSecondLargest(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        int infinity = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            if(arr[i] == max){
                arr[i] = infinity;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i<size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("In this array Largest Value : " + findMax(array));

        System.out.println("In this array Second Largest value : " + findSecondLargest(array));
    }
}
