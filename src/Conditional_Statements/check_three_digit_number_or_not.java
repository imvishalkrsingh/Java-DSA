package Conditional_Statements;
import java.util.Scanner;

// Q9. Write a java program to take positive integer input and tell if it is a three digit number or not.
public class check_three_digit_number_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Positive Number : ");
        int number = sc.nextInt();

        if(number > 99 && number < 1000){
            System.out.println( number + " is a three digit Number ");
        }
        else {
            System.out.println(number + " is not a three digit Number ");
        }
    }
}
