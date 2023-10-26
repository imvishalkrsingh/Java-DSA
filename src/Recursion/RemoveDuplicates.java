/*
Questions asked in Google Microsoft

Q. Remove Duplicates in a given String
 */

package Recursion;
import java.util.Scanner;
public class RemoveDuplicates {

    /**
     * Removes duplicates from a given string using recursion.
     *
     * @param str    The input string.
     * @param idx    The current index in the string.
     * @param newStr The StringBuilder to store the result.
     * @param map    A boolean array to track character occurrences.
     */

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        // Work
        char currChar = str.charAt(idx);
        if(map[currChar -'a'] == true){
            // duplicate
            removeDuplicate(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicate(str, idx+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.next();

        System.out.println("After Removing Duplicates in String");
        System.out.print("Result is : ");
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

        // Close the Scanner resource
        sc.close();

    }
}
