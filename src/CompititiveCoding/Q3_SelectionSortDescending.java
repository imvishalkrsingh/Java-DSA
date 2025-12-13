/*
QUESTION 3 – Selection Sort (Descending)
✅ Problem Statement : Sort running times (in seconds) in decreasing order using Selection Sort and print array after each iteration.
*/


package CompititiveCoding;

import java.util.*;

public class Q3_SelectionSortDescending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) maxIndex = j;
            }

            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            System.out.print("Iteration " + (i + 1) + ": ");
            for (int k = 0; k < n; k++) {
                System.out.print(arr[k]);
                if (k < n - 1) System.out.print(" ");
            }
            if (i < n - 2) System.out.println();
        }
    }
}