package Loops.whileLoop;
import java.util.Scanner;
public class print_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Table : ");
        int n = sc.nextInt();

        int num = 1;
        while(num <= 10){
            int result = n * num;
            System.out.println(n + " * " + num + " = " + result);
            num++;

        }
    }
}
