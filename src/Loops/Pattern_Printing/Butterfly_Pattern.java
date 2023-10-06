package Loops.Pattern_Printing;
import java.util.Scanner;
public class Butterfly_Pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows number : ");
        int rows = sc.nextInt();

//        print first half
        for (int i = 1; i <= rows; i++){
            // print start - i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
//            print start - stars - i
            for (int j = 1; j <= 2*(rows-i); j++){
                System.out.print(" ");
            }
//            print stars - i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        2nd half print
        for (int i = rows; i >= 1; i--){
            // print start - i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
//            print start - stars - i
            for (int j = 1; j <= 2*(rows-i); j++){
                System.out.print(" ");
            }
//            print stars - i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
