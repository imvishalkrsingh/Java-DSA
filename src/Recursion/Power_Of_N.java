package Recursion;
import java.util.Scanner;
public class Power_Of_N {

    public static int power(int x, int n){
        if (n == 0){
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X : ");
        int x = sc.nextInt();

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        System.out.println(power(x,n));

    }
}
