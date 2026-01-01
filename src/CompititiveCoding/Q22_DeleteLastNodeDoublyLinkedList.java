/*
DAY 22 — Delete Last Node from a Doubly Linked List (Basic Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Delete the last node and display the updated list.

Sample Input:
10 20 30 40 50 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q22_DeleteLastNodeDoublyLinkedList {

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

    // Delete last node
    static void deleteLastNode() {
        if (tail == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        tail = tail.prev;
        tail.next = null;
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

        // Delete last node
        deleteLastNode();

        // Display result
        System.out.println("Doubly Linked List after deleting last node:");
        display();

        sc.close();
    }
}