package Functions;
import java.util.Scanner;
public class Prime_in_Range {

    static boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
    static void primesRange(int n){
        for (int i = 2; i <= n; i++){
            if (isPrime(i) == true ){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range to print prime Number : ");
        int number = sc.nextInt();

        System.out.println("Prime numbers between 2 and " + number + " : ");
        primesRange(number);
    }
}
