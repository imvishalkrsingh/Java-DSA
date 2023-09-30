package Arrays.multiDimensional;
import java.util.Scanner;
public class PascalTriangle {

    static void printArray(int[][] arr){
        int row = arr.length;
        int column = arr[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascalTriangle(int n){
        int[][] ans = new int[n][];

        for (int i = 0; i < n; i++){
//            ith row has i+1 column
            ans[i] = new int[i+1];
//            first and last element of every row is 1
            ans[i][0] = ans[i][i] = 1;

            for (int j = 1; j < i; j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }

        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of Array : ");
        int rows = sc.nextInt();

        int[][] ans = pascalTriangle(rows);
        printArray(ans);
    }
}
