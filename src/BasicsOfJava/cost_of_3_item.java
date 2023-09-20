package BasicsOfJava;


/*
 Enter cost of 3 items from the user (using float datatype)
 -a pencil,a pen and an eraser.
 You have to output the total cost of the items
 back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
 */
import java.util.Scanner;
public class cost_of_3_item {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost of pen : ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of pencil : ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of eraser : ");
        float eraser = sc.nextFloat();

        float total_cost = pen + pencil + eraser;

        System.out.println("Total cost of Pen, Pencil and Eraser : " + total_cost);

        float gst = ( total_cost * 18 ) / 100;
        System.out.println("18% GST of Total Cost : " + gst);

        float total_Bill = total_cost + gst;
        System.out.println("Total bill including 18 % GST : " + total_Bill);
    }
}
