package Arrays.singleDimensional;
import java.util.Scanner;
public class PrintPairs {

    public static void printPairs(int[] arr){
        for (int i = 0; i <arr.length; i++){
            int current = arr[i];
            for (int j = i+1; j < arr.length; j++){
                System.out.print("(" + current + "," + arr[j] + ")" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter "+ size + " elements of Array : ");
        for (int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }

        printPairs(array);
    }
}
