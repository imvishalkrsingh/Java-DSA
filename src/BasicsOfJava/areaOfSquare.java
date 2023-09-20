package BasicsOfJava;
import java.util.Scanner;
public class areaOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of Square : ");
        int size = sc.nextInt();

        int area = size * size;

        System.out.println("Area of Square is : " + area);
    }
}
