package Arrays.singleDimensional;
import java.util.Scanner;
public class FirstRepeatingNumber {

    static int firstRepeatingNumber(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of Array : ");
        int size = sc.nextInt();

        int [] array = new int[size];

        System.out.println("Enter " + size + " Elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        System.out.println("First Repeating Number in this array : " + firstRepeatingNumber(array));
    }
}
