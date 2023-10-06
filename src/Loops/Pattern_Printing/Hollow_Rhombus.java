package Loops.Pattern_Printing;
import java.util.Scanner;
public class Hollow_Rhombus {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows : ");
            int rows = sc.nextInt();

            for (int i = 1; i <= rows; i++){
                // spaces
                for (int j = 1; j <= rows-i; j++){
                    System.out.print(" ");
                }

//                hollow rhombus -- stars
                    for (int j = 1; j<=rows; j++){
                        if(i==1 || i==rows || j==1 || j==rows){
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
