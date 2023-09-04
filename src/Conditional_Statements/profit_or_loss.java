package Conditional_Statements;
import java.util.Scanner;

// Q6. Write a java program to take input from user (cost price and selling price ) and find out Profit or loss ?
public class profit_or_loss {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);


        System.out.print("Enter Cost Price of Product : ");
        double cp = sc.nextDouble();

        System.out.print("Enter Selling price of Product : ");
        double sp = sc.nextDouble();

        if (sp > cp ){
            System.out.print("Your Profit is : " + (sp-cp));
        }
        else {
            System.out.println("You Incurred Loss is : " + (cp-sp));
        }
    }
}
