package Conditional_Statements;
import java.util.Scanner;
public class rectangle_area_perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Rectangle : ");
        double length = sc.nextDouble();

        System.out.print("Enter Breadth of Rectangle : ");
        double breadth = sc.nextDouble();

        double area = length * breadth;

        System.out.println("Area of Rectangle : " + area);

        double perimeter = 2 * (length + breadth);

        System.out.println("Perimeter of Rectangle : " + perimeter);

        if(area > perimeter){
            System.out.println("Area of Rectangle is greater than it's Perimeter ");
        }
        else {
            System.out.println("Perimeter of Rectangle is greater than it's Area");
        }

    }
}
