package Arrays.multiDimensional;
import java.util.Scanner;
public class ProductOfTwo_D_Array {

    static void printArray(int[][] arr1){
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[0].length; j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Array 1 : ");
        int rows1 = sc.nextInt();

        System.out.print("Enter Column of Array 1 : ");
        int column1 = sc.nextInt();

        int[][] array1 = new int[rows1][column1];

        System.out.println("Enter elements of Array 1 : ");
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array1[0].length; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is the elements of Array 1 : ");
        printArray(array1);

        System.out.print("Enter rows of array 2 : ");
        int rows2 = sc.nextInt();

        System.out.print("Enter columns of Array 2 : ");
        int column2 = sc.nextInt();

        int[][] array2 = new int[rows2][column2];

        System.out.println("Enter elements of Array 2 : ");
        for (int i = 0; i < array2.length; i++){
            for (int j = 0; j < array2[0].length; j++){
                array2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is the Array 2 : ");
        printArray(array2);
    }
}
