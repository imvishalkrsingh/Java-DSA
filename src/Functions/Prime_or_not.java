package Functions;
import java.util.Scanner;
public class Prime_or_not {

    static boolean isPrime(int n){
        boolean isPrime = true;

        for (int i = 2; i <= n-1; i++ ){
            if(n % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }

//    optimized way of finding a number is prime or not
    static boolean isPrime1(int n){
//        boolean isPrime1 = true;

        for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check a number is prime or not : ");
        int number = sc.nextInt();

//        System.out.println(isPrime(number));

        System.out.println(isPrime1(number));
    }

}
