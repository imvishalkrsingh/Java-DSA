package Recursion;
import java.util.Scanner;

public class Power {

    public static int power(int n, int p){
        if(p == 0){
            return 1;
        }

        int halfPowerSq = power(n, p/2);

        // n is odd
        if (p % 2 != 0){
            return n * halfPowerSq * halfPowerSq;
        } else {
            return halfPowerSq * halfPowerSq;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int n = sc.nextInt();

        System.out.print("Enter Power : ");
        int p = sc.nextInt();

        System.out.println(power(n, p));
    }
}
