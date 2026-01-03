/*
DAY 24 — Display Doubly Linked List Forward and Backward (Basic Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Display the doubly linked list:
1. From first to last
2. From last to first

Sample Input:
10 20 30 40 50 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q24_DisplayDoublyLinkedListBothDirections {

    // Node structure for Doubly Linked List
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

    // Display forward
    static void displayForward() {
        System.out.println("Forward Direction:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display backward
    static void displayBackward() {
        System.out.println("Backward Direction:");
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Ask user for elements
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        // Display list in both directions
        displayForward();
        displayBackward();

        sc.close();
    }
}