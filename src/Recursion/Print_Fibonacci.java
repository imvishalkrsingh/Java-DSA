package Recursion;
import java.util.Scanner;
public class Print_Fibonacci {

    public static int fibonacci(int n){
        if(n == 1 || n == 0){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to print fibonacci : ");
        int number = (sc).nextInt();

        System.out.println(fibonacci(number));;
    }
}
