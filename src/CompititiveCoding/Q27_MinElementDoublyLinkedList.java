/*
DAY 27 — Find Minimum Element in a Doubly Linked List (Basic Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Find and print the minimum element.

Sample Input:
10 25 8 30 15 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q27_MinElementDoublyLinkedList {

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

    // Find minimum element
    static int findMin() {
        if (head == null)
            return Integer.MAX_VALUE;

        int min = head.data;
        Node temp = head.next;

        while (temp != null) {
            if (temp.data < min) {
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
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

        // Find and display minimum element
        int minElement = findMin();
        System.out.println("Minimum element: " + minElement);

        sc.close();
    }
}