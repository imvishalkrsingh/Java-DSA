package LinkedList;
import java.util.LinkedList;

public class Classroom {
    public static void main(String args[]) {
        // Create a linked list
        LinkedList<Integer> ll = new LinkedList<>();

        // Add elements to the linked list
        addLast(ll, 1);
        addLast(ll, 2);
        addFirst(ll, 0);
        // Linked list at this point: 0 -> 1 -> 2
        System.out.println("Linked List after adding elements: " + ll);

        // Remove elements from the linked list
        removeLast(ll);
        removeFirst(ll);
        // Linked list at this point: 1
        System.out.println("Linked List after removing elements: " + ll);

        // Additional operations
        addLast(ll, 3); // Add 3 to the end of the linked list
        addFirst(ll, -1); // Add -1 to the beginning of the linked list
        // Linked list at this point: -1 -> 1 -> 3
        System.out.println("Linked List after additional operations: " + ll);
    }

    // Method to add an element to the end of the linked list
    private static void addLast(LinkedList<Integer> list, int value) {
        list.addLast(value);
    }

    // Method to add an element to the beginning of the linked list
    private static void addFirst(LinkedList<Integer> list, int value) {
        list.addFirst(value);
    }

    // Method to remove the last element from the linked list
    private static void removeLast(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.removeLast();
        }
    }

    // Method to remove the first element from the linked list
    private static void removeFirst(LinkedList<Integer> list) {
        if (!list.isEmpty()) {
            list.removeFirst();
        }
    }
}
