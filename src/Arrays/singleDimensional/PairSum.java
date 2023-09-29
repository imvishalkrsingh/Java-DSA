package Arrays.singleDimensional;
import java.util.Scanner;
public class PairSum {

    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements of an array : ");
        for (int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter Target Value : ");
        int target = sc.nextInt();

        System.out.println("Pair sum of " + target + " : " + pairSum(array,target));
    }
}
