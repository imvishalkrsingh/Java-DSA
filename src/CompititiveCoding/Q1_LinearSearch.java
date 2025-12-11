/*  school recorded roll numbers of students who participated in an event.
You must check whether a given student’s roll number exists using Linear Search. */

/* Sample Input
5
10 20 30 40 50
30
 */


package CompititiveCoding;
import java.util.*;

public class Q1_LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int key = sc.nextInt();

        boolean found = false;
        for (int x : arr) {
            if (x == key) {
                found = true;
                break;
            }
        }

        if (found) System.out.print("Participated");
        else System.out.print("Not Participated");
    }
}