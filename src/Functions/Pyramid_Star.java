package Functions;
import java.util.Scanner;

public class Pyramid_Star {

    static void inverted_rotated_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void inverted_half_pyramid_with_number(int n){
        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= n-i+1; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

//        inverted_rotated_half_pyramid(rows);

        inverted_half_pyramid_with_number(rows);
    }
}
