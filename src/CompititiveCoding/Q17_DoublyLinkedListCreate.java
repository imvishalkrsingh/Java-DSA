/* DAY 17 — Create and Display a Doubly Linked List (Basic Level)
You are given some numbers.
Store these numbers in a doubly linked list.
Your task is to:
	•	Insert elements at the end of the doubly linked list
	•	Display all elements from left to right
Sample Input :
5
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q17_DoublyLinkedListCreate {

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

    // Display list from left to right
    static void displayForward() {
        System.out.println("Doubly Linked List Elements:");
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

        // Display doubly linked list
        displayForward();

        sc.close();
    }
}