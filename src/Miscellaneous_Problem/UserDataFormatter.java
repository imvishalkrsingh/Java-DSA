package Miscellaneous_Problem;

import java.util.Scanner;

public class UserDataFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user details
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter your favorite hobby: ");
        String hobby = scanner.nextLine();

        // Display the data in a formatted way
        System.out.println("\n--- User Information ---");
        System.out.printf("Name: %-20s\n", name);
        System.out.printf("Age: %-20d\n", age);
        System.out.printf("Hobby: %-20s\n", hobby);
        System.out.println("-------------------------");

        scanner.close();
    }
}