package LinkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLL {

    // Function to reverse a linked list iteratively
    public static Node reverseList(Node head) {
        Node current = head; // Pointer to the current node
        Node prev = null;    // Pointer to the previous node
        Node next = null;    // Pointer to the next node

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link to the previous node
            prev = current;      // Move pointers forward
            current = next;
        }

        head = prev; // Update the head to the last node
        return head;
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        // Reverse the linked list
        head = reverseList(head);

        System.out.println("Reversed Linked List:");
        printList(head);
    }
}
