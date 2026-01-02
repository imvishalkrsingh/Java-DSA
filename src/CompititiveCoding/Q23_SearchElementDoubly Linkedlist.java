/*
DAY 23 — Search an Element in a Doubly Linked List (Basic Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Search for a given element.
If found, print "Element Found".
Otherwise, print "Element Not Found".

Sample Input:
10 20 30 40 50 -1
30
*/

package CompititiveCoding;

import java.util.*;

public class Q23_SearchElementDoublyLinkedList {

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

    // Search element
    static boolean search(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Ask user to enter list elements
        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        // 👉 Ask user for element to search
        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        // Search and print result
        if (search(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}