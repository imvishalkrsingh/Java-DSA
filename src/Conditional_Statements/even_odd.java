package Conditional_Statements;
import java.util.Scanner;

// Q2. Write a java program to Take Numbers(input) from user and check whether it is Odd or Even.
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

       if (number % 2 == 0){
           System.out.println("Number is Even");
       }
       else{
           System.out.println("Number is odd");
       }
    }
}
