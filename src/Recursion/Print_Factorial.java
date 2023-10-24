package Recursion;
import java.util.Scanner;
public class Print_Factorial {

    public static int factorial(int n){
        if(n == 0){
            return 1;
        }

        int fnm1 = factorial(n-1);
        int fn = n * factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        System.out.println(factorial(number));
    }
}
