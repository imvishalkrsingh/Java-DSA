package Conditional_Statements;
import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number : ");
        int first = sc.nextInt();

        System.out.print("Enter Operator : ");
        int operator = sc.next().charAt(0);

        System.out.print("Enter Second Number : ");
        int second = sc.nextInt();

        switch (operator){
            case '+' : {
                System.out.println(first + second);
                break;
            }

            case '-' : {
                System.out.println(first - second);
                break;
            }

            case '*' : {
                System.out.println(first * second);
                break;
            }

            case '/' : {
                System.out.println(first / second);
                break;
            }

            case '%' : {
                System.out.println(first % second);
                break;
            }

            default:
                System.out.println("Wrong Operator");
                break;
        }


    }
}
