package Arrays;
import java.util.Scanner;
public class RotateArray {


    static int[] rotateArray(int[] arr, int k){
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n-k; i < n; i++){
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n-k; i++){
            ans[j++] = arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter " + size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter value of K : ");
        int k = sc.nextInt();

        System.out.println("Here is the original Array : ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int[] ans = rotateArray(array,k);

        System.out.println("Here is Array after " + k + " times Rotation : ");
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
