package Loops.ForLoop;
import java.util.Scanner;
public class num_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        System.out.print("Number of Digits in " + num + " : ");

        int numOfDigits = 0;

        for (int i=num; num>0; i++){
            num = num / 10;
            numOfDigits++;
        }


        System.out.println(numOfDigits);
    }
}
