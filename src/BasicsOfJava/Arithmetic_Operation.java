package BasicsOfJava;

public class Arithmetic_Operation {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

//        addition of two numbers (x and Y)
        System.out.print("Addition of x and y : ");
        System.out.println(x+y);

//        Subtraction of two numbers (x and Y)
        System.out.print("Subtraction of x and y : ");
        System.out.println(x-y);

//        Multiplication of two numbers (x and y)
        System.out.print("Multiplication of x and y : ");
        System.out.println(x * y);

//        Division of two numbers ( x and y)
        System.out.print("Division of x and y : ");
        System.out.println(x/y);

//        mod of two numbers
        System.out.print("Mod of x and y : ");
        System.out.println(x%y);

        int z = x % y;
//        printing text and variables Together
        System.out.println("Mod of X and Y is : " +z);
    }
}
