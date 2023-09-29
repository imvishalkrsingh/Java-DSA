package Arrays.singleDimensional;
import java.util.Scanner;

public class isSorted {

    static boolean sorted_or_not(int[] arr){
        boolean check = true;

        for (int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of Array : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the elements of Array is : ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Is Array Sorted or not :  " + sorted_or_not(array));
    }
}
