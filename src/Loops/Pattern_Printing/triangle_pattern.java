package Loops.Pattern_Printing;
import java.util.Scanner;
public class triangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of Rows : ");
        int rows = sc.nextInt();


        for(int i=0; i<=rows; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
