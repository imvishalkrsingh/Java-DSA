package Arrays;
import java.util.Scanner;
public class FindLargestValue {

    static int findlargestValue(int[] arr){
        int n = arr.length;
        int largestValue = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] > largestValue){
                largestValue = arr[i];
            }
        }
        return largestValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Largest Value in this array : " + findlargestValue(array));
    }
}
