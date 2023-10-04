package Functions;
import java.util.Scanner;
public class Binomial_Coefficient {

    static int factorial (int n){
     int fact = 1;
     for (int i = 1; i <= n; i++){
         fact = fact * i;
     }
     return fact;
    }

    static int binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nMr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nMr);
        return binCoeff;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        System.out.print("Enter the value of R : ");
        int r = sc.nextInt();

        System.out.print("Binomial Coefficient of N = " + n + " & R = " + r + " : ");
        System.out.println(binCoeff(n,r));

    }
}
