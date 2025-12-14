/*
QUESTION 4 – Bubble Sort (Descending)
✅ Problem Statement : Sort temperature readings in descending order using Bubble Sort, printing array after each pass.

✅ Input Format
N
temp1 temp2 temp3 ... tempN

✅ Sample Input to paste
5
30 20 50 10 40
*/

package CompititiveCoding;

import java.util.*;

public class Q4_BubbleSortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int pass = 0; pass < n - 1; pass++) {
            for (int j = 0; j < n - pass - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

            System.out.print("After Pass " + (pass + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k]);
                if (k < n - 1) System.out.print(" ");
            }
            if (pass < n - 2) System.out.println();
        }
    }
}