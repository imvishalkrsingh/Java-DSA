/*
DAY 28 — Reverse a Doubly Linked List (Intermediate Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Reverse the doubly linked list and display it.

Sample Input:
10 20 30 40 50 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q28_ReverseDoublyLinkedList {

    // Node structure
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
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

    // Reverse doubly linked list
    static void reverseList() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }

        // Swap head and tail
        if (temp != null) {
            head = temp.prev;
        }
    }

    // Display list
    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Ask user for input
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        // Reverse the list
        reverseList();

        // Display result
        System.out.println("Reversed Doubly Linked List:");
        display();

        sc.close();
    }
}