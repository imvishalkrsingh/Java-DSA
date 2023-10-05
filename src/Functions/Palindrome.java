package Functions;
import java.util.Scanner;

public class Palindrome {

    static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check Palindrome or not : ");
        int number = sc.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Reverse of Number : " + reversedNumber);

        if (number == reversedNumber) {
            System.out.println("Number is Palindrome.");
        } else {
            System.out.println("Number is not Palindrome");
        }
    }
}
