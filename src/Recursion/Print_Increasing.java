package Recursion;
import java.util.Scanner;
public class Print_Increasing {

    public static void printIncreasing(int n){
        if (n == 1){
            System.out.print(n + " ");
            return;
        }

        printIncreasing(n-1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        printIncreasing(10);
    }
}
