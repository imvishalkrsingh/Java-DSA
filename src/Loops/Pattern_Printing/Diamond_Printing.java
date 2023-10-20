package Loops.Pattern_Printing;
import java.util.Scanner;
public class Diamond_Printing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= rows - i; j++){
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*(i-1)+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        for (int i = rows; i >=1; i--){
            for (int j = 1; j <= rows - i; j++){
                System.out.print("   ");
            }
            for (int j = 1; j <= 2*(i-1)+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
