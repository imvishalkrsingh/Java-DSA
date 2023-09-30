package Loops.Pattern_Printing;
import java.util.Scanner;
public class Character_Printing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();

        char ch = 'A';

        for (int i = 1; i <= rows; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
