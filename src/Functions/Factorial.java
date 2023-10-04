package Functions;
import java.util.Scanner;
public class Factorial {

    static int factorial(int n){
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact = fact * i;
            System.out.print(i);
            if (i == n){
                System.out.print(" = ");
            }
            else {
                System.out.print(" * ");
            }
        }
//        System.out.println(" = ");
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Factorial : ");
        int number = sc.nextInt();

        int result = factorial(number);
        System.out.println(result);
    }
}
