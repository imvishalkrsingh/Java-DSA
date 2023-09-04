package Conditional_Statements;
import java.util.Scanner;

//Write a java program to Take Numbers(input) from user and check whether it is divisible by 5 or not.
public class divisible_by_5_or_not {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = sc.nextInt();

        if(number % 5 == 0){
            System.out.println("Entered Number is divisible by 5");
        }
        else{
            System.out.println("Entered number is not divisible by 5");
        }
    }
}
