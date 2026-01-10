/*
DAY 31 — Create and Display a Circular Linked List (Basic Level)

You are given some numbers.
Store these numbers in a circular linked list.
The input will stop when -1 is entered.
Do not store -1 in the list.

Display the circular linked list.

Sample Input:
10 20 30 40 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q31_CreateCircularLinkedList {

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
    static Node tail = null;

    // Insert node at end (Circular)
    static void insertAtEnd(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular link
            return;
        }

        tail.next = newNode;
        tail = newNode;
        tail.next = head; // maintain circular link
    }

    // Display circular linked list
    static void display() {
        if (head == null)
            return;

        System.out.println("Circular Linked List Elements:");
        Node temp = head;

        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
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

        // Display circular linked list
        display();

        sc.close();
    }
}