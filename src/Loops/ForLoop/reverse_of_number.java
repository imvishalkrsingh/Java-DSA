package Loops.ForLoop;
import java.util.Scanner;
public class reverse_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to Reverse : ");
        int number = sc.nextInt();

        System.out.print("Reverse of " + number + " : ");

        int reverse = 0;
        for(int i = number; number > 0; i++){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(reverse);
    }
}
