package Loops.whileLoop;
import java.util.Scanner;
public class print_natural_number_in_reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N : ");
        int n = sc.nextInt();

        int num = n;
        while(num >= 1){
            System.out.println(num);
            num--;

        }
    }
}
