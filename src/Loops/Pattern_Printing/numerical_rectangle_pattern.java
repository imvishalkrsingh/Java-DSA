package Loops.Pattern_Printing;

import java.util.Scanner;

public class numerical_rectangle_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Rows : ");
        int rows = sc.nextInt();

        for (int i=1; i <= rows; i++){
            for (int j=i; j <= rows; j++){
                System.out.print(j + " ");
            }
            for (int k=1; k <= i-1; k++){
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}
