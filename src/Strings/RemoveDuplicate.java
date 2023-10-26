package Strings;
import java.util.Scanner;
public class RemoveDuplicate {
    public static void removeDuplicates(String str) {
        boolean[] map = new boolean[26];
        StringBuilder newStr = new StringBuilder();

        for (int idx = 0; idx < str.length(); idx++) {
            char currChar = str.charAt(idx);
            if (!map[currChar - 'a']) {
                map[currChar - 'a'] = true;
                newStr.append(currChar);
            }
        }

        System.out.println(newStr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        removeDuplicates(str);

        // Close the Scanner resource
        sc.close();
    }

}
