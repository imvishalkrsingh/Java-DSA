package Arrays.singleDimensional;
import java.util.Scanner;
public class RangeQuery {

    static void printArray(int [] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    static int[] makePrefixSum(int[] arr){
        int n = arr.length;

        arr[0] = arr[0];
        for(int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    static void rangeArray(int[] arr, int left, int right){

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array :  ");
        printArray(array);

        int[] makePrefixSum = makePrefixSum(array);

        System.out.println("Enter number of Queries : ");
        int queries = sc.nextInt();

        while (queries-- > 0){
            System.out.println("Enter Range : ");
            int left = sc.nextInt();
            int right = sc.nextInt();

            int ans = makePrefixSum[right] - makePrefixSum[left-1];

            System.out.println("Ans : " + ans);
        }


    }
}
