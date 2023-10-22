package Bit_Manipulation;
import java.util.Scanner;
public class Power_Of_2_Or_Not {

    public static boolean isPowerofTwo(int n){
        return (n&(n-1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check Power of 2 or not : ");
        int number = sc.nextInt();

        System.out.println(isPowerofTwo(number));;
    }
}
