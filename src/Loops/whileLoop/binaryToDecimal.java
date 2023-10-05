package Loops.whileLoop;
import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary Number : ");
        int binary_num = sc.nextInt();

//        int ans = 0;         // Converted decimal number
//        int power = 1;       // 2 ^ 0 = 1 power of 2

//        while(binary_num > 0){
//            int unit_digit = binary_num % 10;
//            ans = ans + (unit_digit * power);
//            binary_num = binary_num / 10;
//            power = power * 2;
//        }
//        System.out.println("Decimal Number : " + ans);


//        +++++++++++++++++++Another Method+++++++++++++++++++++
        int ans1 = 0;
        int power1 = 0;
        while (binary_num > 0){

            int unitDigit = binary_num % 10;
            ans1 = ans1 + (unitDigit * (int)Math.pow(2, power1));

            power1++;
            binary_num = binary_num / 10;
        }
        System.out.println("Decimal Number : " + ans1);
    }
}
