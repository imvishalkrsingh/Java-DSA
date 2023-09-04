package Conditional_Statements;
import java.util.Scanner;

// Q8. Write a java program to take input percentage of a student and print the Grade According to marks.
public class grade_percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage : ");
        double percentage = sc.nextDouble();

        if(percentage > 90 && percentage <= 100){
            System.out.println("Excellent");
        }
        else if (percentage > 80 && percentage <= 90){
            System.out.println("Very Good");
        }
        else if (percentage > 70 && percentage <= 80){
            System.out.println("Good");
        }
        else if (percentage > 60 && percentage <= 70){
            System.out.println("Can do Better");
        }
        else if (percentage > 50 && percentage <= 60){
            System.out.println("Average");
        }
        else if (percentage > 40 && percentage <= 50){
            System.out.println("Below Average");
        }
        else{
            System.out.println("Failed");
        }


    }
}
