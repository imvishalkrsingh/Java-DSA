package Conditional_Statements;
import java.util.Scanner;

// Q 10. Write a java program to take 3 positive integers input and print the greatest of them.


public class greatest_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first positive number : ");
        int first = sc.nextInt();
        System.out.print("Enter second positive number : ");
        int second = sc.nextInt();
        System.out.print("Enter third positive number : ");
        int third = sc.nextInt();

        if(first > second && first > third){
            System.out.println("First number is greatest among 3 of them");
        }
        else if (second > first && second > third) {
            System.out.println("Second number is greatest among 3 of them");
        }
        else {
            System.out.println("Third number is greatest among 3 of them");
        }

    }
}
