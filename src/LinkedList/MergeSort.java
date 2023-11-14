package LinkedList;
import java.util.LinkedList;
public class MergeSort {
    public static void mergeSort(LinkedList<Integer> ll) {
        // Base case: If the linked list is empty or has only one element, it is already sorted
        if (ll.size() <= 1) {
            return;
        }

        // Split the linked list into two halves
        int mid = ll.size() / 2;
        LinkedList<Integer> leftHalf = new LinkedList<>(ll.subList(0, mid));
        LinkedList<Integer> rightHalf = new LinkedList<>(ll.subList(mid, ll.size()));

        // Recursively sort the two halves
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        // Merge the sorted halves
        merge(ll, leftHalf, rightHalf);
    }

    private static void merge(LinkedList<Integer> result, LinkedList<Integer> left, LinkedList<Integer> right) {
        int i = 0, j = 0, k = 0;

        // Compare elements from the left and right halves and merge them in sorted order
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.set(k++, left.get(i++));
            } else {
                result.set(k++, right.get(j++));
            }
        }

        // Copy the remaining elements from left and right halves if any
        while (i < left.size()) {
            result.set(k++, left.get(i++));
        }

        while (j < right.size()) {
            result.set(k++, right.get(j++));
        }
    }

    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        System.out.println("Original Linked List: " + ll);

        // Sort the linked list using merge sort
        mergeSort(ll);

        System.out.println("Sorted Linked List: " + ll);
    }
}