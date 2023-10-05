/*
Function overloading in Java allows a class to have multiple methods with the same name but with different parameters. The idea is that you can use the same method name for different behaviors or actions based on the type or number of parameters. Here's an example:
 */

package Functions;
import java.util.Scanner;
public class Function_Overloading {

    static int add(int a, int b){
        int add = a + b;
        return add;
    }

    static int add(int a, int b, int c){
        int add = a + b + c;
        return add;
    }

    static float add(float a, float b){
        float add = a + b;
        return add;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter value of c : ");
        int c = sc.nextInt();

        System.out.println("Sum of two integer arguments : " + add(a,b));

        System.out.println("Sum of three integer arguments : " + add(a,b,c));

        System.out.println("Sum of two float arguments : " + add(3.5f, 5.9f));

    }
}

/*
The compiler determines which method to call based on the number and types of arguments provided during the method invocation. Function overloading provides flexibility and readability to the code by allowing you to use the same method name for similar operations.
 */
