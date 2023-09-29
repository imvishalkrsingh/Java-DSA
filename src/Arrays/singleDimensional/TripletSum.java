package Arrays.singleDimensional;
import java.util.Scanner;
public class TripletSum {

    static int tripletSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i=0; i<n; i++) {                   // finding first number
            for (int j = i+1; j<n; j++) {           // finding second number
                for (int k = j+1; k<n; k++) {       // finding third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
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
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter Target Value : ");
        int target = sc.nextInt();

        System.out.println("Triplet sum of " + target + " : " + tripletSum(array,target));
    }
}
