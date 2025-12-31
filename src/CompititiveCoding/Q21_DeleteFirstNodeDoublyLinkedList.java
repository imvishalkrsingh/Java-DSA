/* DAY 21 — Delete First Node from a Doubly Linked List (Basic Level)
You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.
Your task is to:
	•	Delete the first node of the doubly linked list
	•	Display the linked list after deletion
⚠️ If the list is empty, nothing should be deleted.

Sample Input : 10 20 30 40 50 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q21_DeleteFirstNodeDoublyLinkedList {

    // Node structure for Doubly Linked List
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Insert node at end
    static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Delete first node
    static void deleteFirstNode() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            // Only one node
            head = null;
            tail = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // Display doubly linked list
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for elements
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int val = sc.nextInt();

            if (val == -1)
                break;

            insertAtEnd(val);
        }

        // Delete first node
        deleteFirstNode();

        // Display result
        System.out.println("Doubly Linked List after deleting first node:");
        display();

        sc.close();
    }
}
