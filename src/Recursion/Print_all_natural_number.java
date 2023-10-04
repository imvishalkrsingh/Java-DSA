// Q. Write a program to print all natural number from 1 to n using recursion.


package Recursion;
import java.util.Scanner;
public class Print_all_natural_number {

    static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        printIncreasing(n);
    }
}
