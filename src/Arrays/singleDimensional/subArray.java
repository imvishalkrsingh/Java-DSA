package Arrays.singleDimensional;
import java.util.Scanner;
public class subArray {

    public static void printSubArrays(int[] arr){
        int totalSubArray = 0;
        for (int i = 0; i < arr.length; i++){
            int start = i;
            for (int j = i; j < arr.length; j++){
                int end = j;
                for (int k = start; k < end; k++){
                    System.out.print(arr[k] + " ");
                }
                totalSubArray++;
                System.out.println();
            }
        }
        System.out.println("Total Number of subArray : " + totalSubArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter " + size + " Elements of array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Sub Arrays of Array : ");
        printSubArrays(array);
    }
}
