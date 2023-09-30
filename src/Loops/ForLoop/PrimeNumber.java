package Loops.ForLoop;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to check prime or not : ");
        int number = sc.nextInt();

        boolean isPrime = true;
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if(isPrime == true){
            System.out.println("Number is prime.");
        }else {
            System.out.println("Number is not prime");
        }
    }
}
