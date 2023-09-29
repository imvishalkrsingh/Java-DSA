package Arrays.multiDimensional;

import java.util.Scanner;

public class SumOfTwo_D_Array {

    static void print_2_D_array(int[][] arr){
        int rows = arr.length;

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] sumOf2_D_array(int[][] arr1, int[][] arr2){
        int rows = arr1.length;
        int columns = arr1[0].length;

        int[][] sumArray = new int[rows][columns];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                sumArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows of array : ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns of array : ");
        int columns = sc.nextInt();

        int[][] array1 = new int[rows][columns];

        System.out.println("Enter elements of Rows : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Here is the Elements of Array 1 : ");
        print_2_D_array(array1);

        System.out.print("Enter Rows of array : ");
        int rows2 = sc.nextInt();

        System.out.print("Enter Columns of array : ");
        int columns2 = sc.nextInt();

        int[][] array2 = new int[rows2][columns2];

        System.out.println("Enter elements of Rows : ");
        for (int i = 0; i < rows2; i++){
            for (int j = 0; j < columns2; j++){
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is the Elements of Array 2 : ");
        print_2_D_array(array2);


        System.out.println("Here is the Sum of Array1 & Array2 :");
        print_2_D_array(sumOf2_D_array(array1,array2));
    }
}
