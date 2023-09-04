package Conditional_Statements;
import java.util.Scanner;
// Q1. Take Numbers from user and check it whether it is positive or negative Number.
public class check_Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to check whether it is postive or negative : ");
        int number = sc.nextInt();

        if(number / 1 >= 0){
            System.out.println("Number is Positive.");
        }
        else {
            System.out.println("Number is Negative");
        }
    }
}
