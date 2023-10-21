package Arrays.multiDimensional;
import java.util.Scanner;

public class DiagonalSum {

    public static void printArray(int rows, int columns){
        int[][] array = new int[rows][columns];
        int count = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(count + "   ");
                count++;
            }
            System.out.println();
        }
    }

    public static int diagonalSum(int[][] arr) {
        int row = arr.length;
        int column = arr[0].length;
        int left_D_sum = 0;
        int right_D_sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (i == j) {
                    left_D_sum += arr[i][j];
                }
                // The condition should be else if, not just else
                else if (i + j == row - 1) {
                    right_D_sum += arr[i][j];
                }
            }
        }
        // You should return the sum of both diagonals, not just left_D_sum
        return left_D_sum + right_D_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];
        int count = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = count; // You need to assign values to array elements
                count++;
            }
        }
        printArray(rows,columns);
        System.out.println("Diagonal sum: " + diagonalSum(array));
    }
}
