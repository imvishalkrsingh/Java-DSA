package Conditional_Statements;
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = sc.nextInt();

        System.out.println("Enter Number is : " +number);

        if(number < 0 ){
           number = number * (-1);
        }
        System.out.println("Absolute Value is : " + number);
    }
}
