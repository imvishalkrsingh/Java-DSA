package Loops.Pattern_Printing;
import java.util.Scanner;
public class hallow_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Value of Rows : ");
        int rows = sc.nextInt();

        System.out.print("Enter the value of Columns : ");
        int columns = sc.nextInt();

       for (int i = 1; i<=rows; i++){
           for (int j = 1; j<=columns; j++){
               if(i==1 || i==rows || j==1 || j==columns){
                   System.out.print("*");
               }
               else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
    }
}
