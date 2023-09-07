package Loops.ForLoop;
import java.util.Scanner;

// Q. Find the sum of the following series (S = 1-2+3-4+5)
public class series_of_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the series of number : ");
        int number = sc.nextInt();

        int sum = 0;

        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                sum = sum - i;
            }
            else{
                sum = sum + i;
            }
        }
        System.out.println("Series of even odd " + sum);

    }
}
