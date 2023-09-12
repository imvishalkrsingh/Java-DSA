package Loops.ForLoop;
import java.util.Scanner;
public class prime_number {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check prime or Not : ");
        int n = sc.nextInt();

        for(int i = 2; i<n; i++){
            if(n % i == 0 ){
                System.out.println("Not a Prime Number");
                break;
            }
            else {
                System.out.println(" Prime Number ");
            }
        }
    }
}
