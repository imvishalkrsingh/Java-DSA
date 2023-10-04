// Q. Write a program to print all natural numbers from n to 1 using recursion.
package Recursion;
import java.util.Scanner;

public class Print_Decreasing {

    static void printDecreasing(int n){
        if (n == 1){
            System.out.println(1);
            return;
        }
//        self Work
        System.out.println(n);

//        recursive work
        printDecreasing(n-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of N : ");
        int n = sc.nextInt();

        printDecreasing(n);

    }
}
