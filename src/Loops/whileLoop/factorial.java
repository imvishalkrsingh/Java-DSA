package Loops.whileLoop;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int n = sc.nextInt();

        int fact = 1; // Initialize fact to 1
        int i = 1;

        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is " + fact);
    }
}
