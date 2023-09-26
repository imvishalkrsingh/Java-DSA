package Conditional_Statements;
import java.util.Scanner;
public class Positive_or_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to check Positive or Negative : ");
        int number = sc.nextInt();

        if(number >= 0){
            System.out.println("Number is Positive");
        }
        else {
            System.out.println("Number is Negative");
        }
    }
}
