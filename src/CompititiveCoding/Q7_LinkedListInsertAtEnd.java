/*
Write a program to create a singly linked list by inserting elements at the end of the list.
The input ends when -1 is encountered.
Do not store -1 in the linked list.
Finally, display the linked list elements.

Sample Input : 10 20 30 40 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q7_LinkedListInsertAtEnd {

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
    static void insertAtEnd(int data) {
        Node newNode = new Node(data);

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

    // Display linked list
    static void display() {
        System.out.println("Linked List Elements:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null)
                System.out.print(" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        display();
        sc.close();
    }
}