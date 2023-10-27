/*
Q. Binary Strings Problem - (Paytm)
- Print all binary strings of size N without consecutive ones.
 */
package Recursion;
import java.util.Scanner;
public class BinaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str){
        //Base case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // work
        printBinaryStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinaryStrings(n-1, 1, str+"1");
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printBinaryStrings(3, 0, "");
    }
}
