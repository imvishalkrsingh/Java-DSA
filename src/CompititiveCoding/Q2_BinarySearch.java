/*QUESTION 2 – Binary Search
✅ Problem Statement : Given a sorted price list, search for a specific price using Binary Search and print the index.

Input Format
N
p1 p2 p3 ... pN
priceToSearch

Sample Input
5
10 20 30 40 50
30
 */

import java.util.*;

public class Q2_BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int key = sc.nextInt();

        int low = 0, high = n - 1, index = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1) System.out.print("Index: " + index);
        else System.out.print("Not Found");
    }
}

