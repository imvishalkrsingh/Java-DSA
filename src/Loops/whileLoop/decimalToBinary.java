package Loops.whileLoop;
import java.util.Scanner;
public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number : ");
        int decimal_num = sc.nextInt();

        int ans = 0; // Binary number
        int power = 1; // Represents power of 10

        while(decimal_num > 0){
            int parity = decimal_num % 2;
            ans = ans + (parity * power);
            power = power * 10;

            decimal_num = decimal_num / 2;
        }
        System.out.println("Binary Number : " + ans);
    }
}
