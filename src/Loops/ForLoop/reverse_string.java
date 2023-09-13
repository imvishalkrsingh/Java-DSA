package Loops.ForLoop;
import java.util.Scanner;
public class reverse_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to Reverse : ");
        String str= sc.next(), nstr="";
        char ch;

        System.out.println("Original word: " + str);

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);
    }
}
