package Loops.ForLoop;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number : ");
        int number = sc.nextInt();

        System.out.print("Sum of Digits of " +number + " : ");
        int sumOfDigits = 0;

        for(int i = number; number > 0; i++){
            sumOfDigits = sumOfDigits + number % 10;

            number = number / 10;
        }
        System.out.println(sumOfDigits);
    }
}
