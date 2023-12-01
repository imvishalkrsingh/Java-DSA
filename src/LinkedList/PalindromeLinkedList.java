import java.util.Scanner;
import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class PalindromeLinkedList {
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single-node list is considered a palindrome
        }

        Stack<Integer> stack = new Stack<>();
        Node slow = head;
        Node fast = head;

        // Push elements from the first half of the linked list onto the stack
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // If the list has an odd number of elements, skip the middle one
        if (fast != null) {
            slow = slow.next;
        }

        // Compare the remaining elements with the popped elements from the stack
        while (slow != null) {
            if (slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public static Node createLinkedList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the linked list: ");
        int n = scanner.nextInt();

        Node head = null;
        Node tail = null;

        System.out.println("Enter the elements of the linked list:");

        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        // Create a linked list based on user input
        Node head = createLinkedList();

        // Check if the linked list is a palindrome
        System.out.println("Is the linked list a palindrome? " + isPalindrome(head));
    }
}
