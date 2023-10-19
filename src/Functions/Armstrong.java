package Functions;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to Check Armstrong or not : ");
        int number = sc.nextInt();
        int originalNumber = number;
        int digitCount = 0;

        // Count the number of digits in the input
        while (originalNumber != 0) {
            originalNumber /= 10;
            digitCount++;
        }

        originalNumber = number;
        int sum = 0;

        // Calculate the sum of digits raised to the power of digitCount
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digitCount);
            originalNumber /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
