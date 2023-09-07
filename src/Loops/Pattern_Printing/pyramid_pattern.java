package Loops.Pattern_Printing;
import java.util.Scanner;
public class pyramid_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of rows : ");
        int rows = sc.nextInt();

        for(int i=1; i <= rows; i++){  // traversing over rows....

//            print r-1 spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
//            print 2*i-1
            for (int k=1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
