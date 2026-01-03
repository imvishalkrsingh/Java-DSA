/*
DAY 25 — Count Even and Odd Elements in a Doubly Linked List (Basic Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Count the number of even and odd elements.

Sample Input:
10 15 20 25 30 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q25_CountEvenOddDoublyLinkedList {

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

    // Count even and odd elements
    static void countEvenOdd() {
        int evenCount = 0;
        int oddCount = 0;

        Node temp = head;
        while (temp != null) {
            if (temp.data % 2 == 0)
                evenCount++;
            else
                oddCount++;

            temp = temp.next;
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
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

        // Count and display even & odd
        countEvenOdd();

        sc.close();
    }
}