/*
QUESTION 5 – Insertion Sort (Ascending)
✅ Problem Statement : Sort books by thickness in increasing order using Insertion Sort, printing after each step.

✅ Sample Input :
5
12 7 15 10 8
*/

package CompititiveCoding;

import java.util.*;

public class Q5_InsertionSortAscending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int step = 1; step < n; step++) {
            int key = arr[step];
            int j = step - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.print("After Step " + step + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k]);
                if (k < n - 1) System.out.print(" ");
            }
            if (step < n - 1) System.out.println();
        }
    }
}