package Strings;
import java.util.Scanner;
public class Palindrome {

    public static boolean isPalindrome(String str){

        int n = str.length();
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name : ");
        String name = sc.next();

        System.out.print("Check Palindrome : " + isPalindrome(name));

    }
}
