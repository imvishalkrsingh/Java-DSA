package Loops.Pattern_Printing;
import java.util.Scanner;
public class star_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the value of Columns : ");
        int columns = sc.nextInt();

        for(int i = 0;  i< rows; i++ ){
            for (int j=0; j<columns; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
