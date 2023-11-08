package ArrayList;
import java.util.ArrayList;

public class Swap2Number {

    // Function to swap elements at specified indices in an ArrayList
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        // Temporary variable to store the value at idx1
        int temp = list.get(idx1);

        // Set the value at idx1 to the value at idx2
        list.set(idx1, list.get(idx2));

        // Set the value at idx2 to the original value at idx1
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // Indices to be swapped
        int idx1 = 1;
        int idx2 = 3;

        // Display the ArrayList before swapping
        System.out.println("Before swapping:");
        System.out.println(list);

        // Perform the swap
        swap(list, idx1, idx2);

        // Display the ArrayList after swapping
        System.out.println("\nAfter swapping:");
        System.out.println(list);
    }
}
