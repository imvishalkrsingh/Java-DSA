package Loops.whileLoop;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int number = sc.nextInt();

        System.out.print("Sum of digits of " + number + " : ");

        int sumOfDigits = 0;
        while (number > 0){
            sumOfDigits = sumOfDigits + number % 10;
            number = number / 10;
        }
        System.out.println(sumOfDigits);
    }
}
