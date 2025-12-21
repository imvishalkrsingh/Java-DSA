/*
Problem Statement : Emma maintains her to-do list using a singly linked list.
You are given a linked list of tasks (numbers).
You need to perform three delete operations:
	1.	Delete the first node
	2.	Delete the last node
	3.	Delete the node at a given position
(Position is 0-based index)
After each delete operation, print the updated linked list.

Sample Input : 
10 20 30 40 50 -1
2

*/


package CompititiveCoding;

import java.util.*;

public class Q11_DeleteNodesLinkedList {

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

    // Insert at end
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
    static void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete last node
    static void deleteLast() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete node at given position (0-based)
    static void deleteAtPosition(int pos) {
        if (head == null || pos < 0)
            return;

        if (pos == 0) {
            deleteFirst();
            return;
        }

        Node temp = head;
        for (int i = 0; i < pos - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    // Display linked list
    static void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter to-do list elements (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
            
        }

        // Delete first node
        deleteFirst();
        System.out.println("After deleting first node:");
        display();

        // Delete last node
        deleteLast();
        System.out.println("After deleting last node:");
        display();

        // Delete node at given position
        System.out.println("Enter position to delete (0-based index):");
        int pos = sc.nextInt();
        deleteAtPosition(pos);

        System.out.println("After deleting node at position " + pos + ":");
        display();

        sc.close();
    }
}