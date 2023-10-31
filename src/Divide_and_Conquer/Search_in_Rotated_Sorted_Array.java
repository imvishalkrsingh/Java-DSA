package Divide_and_Conquer;
import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int search(int[] nums, int target) {
        return searchHelper(nums, target, 0, nums.length - 1);
    }

    private static int searchHelper(int[] nums, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }

        int mid = (left + right) / 2;

        if (nums[mid] == target) {
            return mid; // Target found
        }

        // Check which half is normally ordered
        if (nums[left] <= nums[mid]) { // Left half is normally ordered
            if (nums[left] <= target && target <= nums[mid]) {
                return searchHelper(nums, target, left, mid - 1); // Search in the left half
            } else {
                return searchHelper(nums, target, mid + 1, right); // Search in the right half
            }
        } else { // Right half is normally ordered
            if (nums[mid] <= target && target <= nums[right]) {
                return searchHelper(nums, target, mid + 1, right); // Search in the right half
            } else {
                return searchHelper(nums, target, left, mid - 1); // Search in the left half
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Here is the Original Array : ");
        printArray(arr);

        System.out.println("Enter target :");
        int target = sc.nextInt();

        int result = search(arr, target);

        if (result != -1) {
            System.out.println("Index of " + target + ": " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
