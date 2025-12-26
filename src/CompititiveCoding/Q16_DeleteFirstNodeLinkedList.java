/* DAY 16 — Delete First Node from a Singly Linked List
You are given some numbers.
Store these numbers in a singly linked list.
Your task is to:
	•	Delete the first node of the linked list
	•	Display the linked list after deletion
⚠️ If the list is empty, nothing should be deleted.

Sample Input : 
5
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q16_DeleteFirstNodeLinkedList {

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

    // Insert node at end
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

    // Delete first node
    static void deleteFirstNode() {
        if (head != null) {
            head = head.next;
        }
    }

    // Display linked list
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for number of elements
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // Ask user for elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd(val);
        }

        // Delete first node
        deleteFirstNode();

        // Display result
        System.out.println("Linked List after deleting first node:");
        display();

        sc.close();
    }
}

