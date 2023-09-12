package Loops.Pattern_Printing;

import java.util.Scanner;
public class even_odd_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the value of Columns : ");
        int col = sc.nextInt();

        for (int i = 1; i <= rows; i++){
            for (int j=1; j <= col; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1);
                }
                else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}
