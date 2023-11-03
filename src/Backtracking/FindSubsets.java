package Backtracking;
import java.util.Scanner;
public class FindSubsets {

    public static void findSubset(String str, String ans, int i){
        // Base cas
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
            } else{
                System.out.println(ans);
            }
            return;
        }

        // recursion step
        // yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        // no choice
        findSubset(str, ans, i+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.next();

        findSubset(str, "", 0);
    }
}
