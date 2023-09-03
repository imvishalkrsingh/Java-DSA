package BasicsOfJava;
import java.util.Scanner;
public class Taking_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of radius : ");
        int radius;
        radius = sc.nextInt();

//        it can be written within a Single line
//        int radius = sc.nextInt();

        double pie = 3.14;

        double areaOfCircle = pie * radius * radius;

        System.out.print("Area of Circle  : ");
        System.out.println(areaOfCircle);


//        Sum of two numbers with taking input from users.

        System.out.print("Enter the first number to add : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number to add : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of two Numbers is : ");
        System.out.println(sum);



    }
}
