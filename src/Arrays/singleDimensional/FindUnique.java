package Arrays.singleDimensional;
import java.util.Scanner;
public class FindUnique {

    static int findUique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        int ans = -1;
        for (int i = 0; i < n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Unique elements in an Array is : " + findUique(array));
    }

}
