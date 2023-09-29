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

    static int[][] product_of_2_D_Array(int[][] arr1, int[][] arr2){
        int row1 = arr1.length;
        int column1 = arr1[0].length;

        int row2 = arr2.length;
        int column2 = arr2[0].length;

        if(column1 != row2){
            System.out.println("Multiplication is not possible. Number of columns in the first matrix should be equal to the number of rows in the second matrix.");
            return null;
        }

        int[][] resultArray = new int[row1][column2];

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int k = 0; k < column1; k++) {
                    resultArray[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return resultArray;
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

        System.out.println("Here is Product of Array1 & Array2 : ");
        printArray(product_of_2_D_Array(array1,array2));
    }
}
