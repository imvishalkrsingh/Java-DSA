package Arrays.multiDimensional;
import java.util.Scanner;
public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns : ");
        int columns = sc.nextInt();

        System.out.println("Matrices of " + rows +" * " + columns );
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(i+ ",");
                System.out.print(j + "  ");
            }
            System.out.println();
        }
    }
}
