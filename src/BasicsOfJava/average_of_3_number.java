package BasicsOfJava;

import java.util.Scanner;

public class average_of_3_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = sc.nextInt();

        System.out.print("Enter Second number : ");
        int second = sc.nextInt();

        System.out.print("Enter third number ; ");
        int third = sc.nextInt();

        int avg = (first + second + third) / 3;

        System.out.println("Average of " + first + "," + second + "," + third + " is : " + avg);
    }
}
