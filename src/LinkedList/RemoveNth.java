package LinkedList;

public class RemoveNth {
    // Definition of ListNode class representing a node in the linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Main method for testing the removeNthFromEnd function
    public static void main(String args[]) {
        // Example usage
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list:");
        printList(head);

        int n = 2; // specify the position from the end to remove
        head = removeNthFromEnd(head, n);

        System.out.println("\nLinked list after removing the " + n + "th node from the end:");
        printList(head);
    }

    // Function to remove the nth node from the end of a linked list
    private static ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast pointer n+1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the nth node from the end
        slow.next = slow.next.next;

        // Return the updated head of the linked list
        return dummy.next;
    }

    // Utility function to print the elements of the linked list
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
