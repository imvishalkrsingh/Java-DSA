/*DAY 12 — Find Maximum Element in a Singly Linked List (Easy Level) */
package CompititiveCoding;

import java.util.*;

public class Q12_MaxElementLinkedList {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Insert at end
    static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Find maximum element
    static int findMax() {
        int max = head.data;
        Node temp = head.next;

        while (temp != null) {
            if (temp.data > max) {
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 🔹 Ask for number of elements
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // 🔹 Ask for linked list elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd(val);
        }

        // 🔹 Find and display maximum element
        int maxElement = findMax();
        System.out.println("Maximum element: " + maxElement);

        sc.close();
    }
}