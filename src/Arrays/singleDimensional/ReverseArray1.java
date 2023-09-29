package Arrays.singleDimensional;
import java.util.Scanner;
public class ReverseArray1 {

    static int[] reverseArray(int[] arr){
        int n = arr.length;
        int[] reverse = new int[n];
        int j = 0;

        for(int i = n-1; i >= 0; i--){
            reverse[j] = arr[i];
            j++;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Here is the Original Array : ");
        for (int i = 0; i < size; i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        int[] ans = reverseArray(array);
        System.out.println("Here is the Reverse of the Array : ");
        for (int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
