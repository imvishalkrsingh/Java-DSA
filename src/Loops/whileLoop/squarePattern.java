package Loops.whileLoop;
import java.util.Scanner;
public class squarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of Rows : ");
        int rows = sc.nextInt();

        int i = 0;
        while (i < rows){
            System.out.println("* * * *");
            i++;
        }
    }
}
