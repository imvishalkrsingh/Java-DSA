package Loops.Pattern_Printing;
import java.util.Scanner;
public class InvertedStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Rows : ");
        int rows = sc.nextInt();

        for (int i = rows; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
