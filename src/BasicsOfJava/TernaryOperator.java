package BasicsOfJava;
import java.util.Scanner;
public class TernaryOperator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check even or odd : ");
        int number = sc.nextInt();


        String check = ((number % 2) == 0) ? "even" : "odd";

        System.out.println(check);
    }
}
