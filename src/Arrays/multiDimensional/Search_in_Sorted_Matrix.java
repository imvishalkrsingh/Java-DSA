package Arrays.multiDimensional;
import java.util.Scanner;

public class Search_in_Sorted_Matrix {

    public static void search_in_sorted_matrix(int[][] arr, int key) {
        int row = arr.length;
        int column = arr[0].length;
        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (key == arr[i][j]) {
                    found = true;
                    System.out.println("Element found");
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter Number of columns : ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];
        System.out.println("Enter " + rows * columns + " Elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter number to search : ");
        int key = sc.nextInt();

        System.out.print("Result : ");
        search_in_sorted_matrix(array, key);
    }
}
