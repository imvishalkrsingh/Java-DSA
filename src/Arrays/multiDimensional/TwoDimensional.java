package Arrays.multiDimensional;
import java.util.Scanner;
public class TwoDimensional {

    static void print2Darray(int[][] arr){
        int rows = arr.length;

//        int column = arr[][].length;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int [][] array = new int[][]{
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };


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

        System.out.println("Here is the Elements of 2D Arrays : ");
        print2Darray(array1);
    }
}
