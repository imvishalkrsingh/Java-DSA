package Bit_Manipulation;
import java.util.Scanner;
public class check_Even_Odd {

    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) ==  0){
            System.out.println("Even Number");
        }
        else {
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to check even or odd : ");
        int number = sc.nextInt();

        evenOrOdd(number);
    }
}
