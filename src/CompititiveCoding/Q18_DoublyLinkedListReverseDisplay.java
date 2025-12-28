/* DAY 18 — Display a Doubly Linked List in Reverse Order (Basic Level)
You are given some numbers.
Store these numbers in a doubly linked list.
Your task is to:
	•	Insert elements at the end of the doubly linked list
	•	Display the elements in reverse order (from last to first)

    Sample Input : 
5
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q18_DoublyLinkedListReverseDisplay {

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

    // Display list in reverse order
    static void displayReverse() {
        System.out.println("Doubly Linked List in Reverse Order:");
        Node temp = tail;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
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

        // Display in reverse
        displayReverse();

        sc.close();
    }
}