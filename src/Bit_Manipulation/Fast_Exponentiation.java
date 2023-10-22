package Bit_Manipulation;
import java.util.Scanner;
public class Fast_Exponentiation {

    public static int fastExpo(int a, int n){
        int ans = 1;

        while (n > 0){
            if ((n & 1) != 0) {
                // check LSB
                ans = ans * a;
            }
            a = a*a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int number = sc.nextInt();

        System.out.print("Enter Power value : ");
        int power = sc.nextInt();

        System.out.print("Fast Exponential : ");
        System.out.println(fastExpo(power,number));
    }
}
