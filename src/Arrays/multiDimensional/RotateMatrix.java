package Arrays.multiDimensional;

import java.util.Scanner;

public class RotateMatrix {

    static void printArray(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;

        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void TransposeInplace(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < column; i++){
            for (int j = i; j < row; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    static void reverseArray(int[] arr){
        int i = 0; int j = arr.length-1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void rotateMatrix(int[][] arr){
        int n = arr.length;
//        transpose
        TransposeInplace(arr);

//        reverse each row of transposed matrix
        for (int i = 0; i < n; i++){
            reverseArray(arr[i]);
        }
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows of Array : ");
        int rows = sc.nextInt();

        System.out.print("Enter Columns of Array : ");
        int columns = sc.nextInt();

        int [][] array = new int[rows][columns];
        int totalElements = rows * columns;

        System.out.println("Enter " + rows + " * " + columns + " matrix elements : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here is the Array : ");
        printArray(array);

        System.out.println("Here is the Rotation of the given Matrix : ");
        rotateMatrix(array);
        printArray(array);

    }
}
