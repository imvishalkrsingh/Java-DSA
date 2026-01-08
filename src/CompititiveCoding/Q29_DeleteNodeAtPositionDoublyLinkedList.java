/*
DAY 29 — Delete Node at a Given Position in a Doubly Linked List (Intermediate Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Delete the node at position P (0-based index).
If position is invalid, do nothing.

Sample Input:
10 20 30 40 50 -1
2
*/

package CompititiveCoding;

import java.util.*;

public class Q29_DeleteNodeAtPositionDoublyLinkedList {

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

    // Delete node at given position (0-based)
    static void deleteAtPosition(int pos) {
        if (head == null || pos < 0)
            return;

        // Delete first node
        if (pos == 0) {
            if (head.next == null) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < pos) {
            temp = temp.next;
            index++;
        }

        // Invalid position
        if (temp == null)
            return;

        // Delete last node
        if (temp == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // Delete middle node
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
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

        // 👉 Read list elements
        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        // 👉 Read position
        System.out.println("Enter position to delete (0-based index):");
        int pos = sc.nextInt();

        // Delete node
        deleteAtPosition(pos);

        // Display updated list
        System.out.println("Updated Doubly Linked List:");
        display();

        sc.close();
    }
}