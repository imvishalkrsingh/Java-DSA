package Arrays.singleDimensional;
import java.util.Scanner;
public class SortingArray {

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

    static void sortZeroAndOne(int[] arr){
        int n = arr.length;
        int left = 0,  right = n-1;

        while (left < right){
            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            } else {
                if(arr[left] == 0) left++;
                if(arr[right] == 1) right--;
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Here Is the Original Array : ");
        printArray(arr);

        sortZeroAndOne(arr);

        System.out.println("Here is the Sorted Array : ");
        printArray(arr);

    }
}


