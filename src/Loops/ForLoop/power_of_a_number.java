package Loops.ForLoop;
import java.util.Scanner;

// Q. Take input 2 numbers from users a and b, and find a raise to the power b.
public class power_of_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Power of " + a + " and " + b + " : ");

        int power = 1;

        for(int i = 0; i < b; i++){

            power = power * a;
        }

        System.out.println(power);
    }
}
