package Conditional_Statements;
import java.util.Scanner;

// Q4. Write a java program to take (years)input from user to check whether it is leap year or not ?
public class leap_year_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year (after 2000) to check Leap year or not : ");
        int year = sc.nextInt();

        if(year % 4 == 0){
            System.out.println(year + " is Leap year");
        }
        else {
            System.out.println(year + " is Not a leap Year");
        }
    }
}
