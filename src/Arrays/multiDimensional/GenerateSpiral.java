package Arrays.multiDimensional;
import java.util.Scanner;
public class GenerateSpiral {

    static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;
        int currentElement = 1;

        while (currentElement <= n * n){

//          topRow => leftCol to rightCol
            for (int j = leftCol; j <= rightCol && currentElement <= n * n; j++){
                matrix[topRow][j] = currentElement;
                currentElement++;
            }
            topRow++;

//            rightCol => topRow to bottomRow
            for (int i = topRow; i <= bottomRow && currentElement <= n * n; i++){
                matrix[i][rightCol] = currentElement;
                currentElement++;
            }
            rightCol--;

//            bottomRow =>  rightCol to leftCol
            for (int j = rightCol; j >= leftCol && currentElement <= n * n; j--){
                matrix[bottomRow][j] = currentElement;
                currentElement++;
            }
            bottomRow--;

//            leftCol => bottomRow to topRow
            for (int i = bottomRow; i >= topRow && currentElement <= n * n; i--){
                matrix[i][leftCol] = currentElement;
                currentElement++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of N : ");
        int n = sc.nextInt();

        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
