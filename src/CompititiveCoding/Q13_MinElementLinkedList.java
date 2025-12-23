/* DAY 13 — Find Minimum Element in a Singly Linked List (Easy Level) 
You are given some numbers. Store these numbers in a singly linked list.
Your task is to find and print the minimum element present in the linked list.

Sample Input : 
5
10 25 8 30 15
*/

package CompititiveCoding;

import java.util.*;

public class Q13_MinElementLinkedList {

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

    // Insert node at end
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

    // Find minimum element
    static int findMin() {
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

        // Ask user for number of elements
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // Ask user for elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd(val);
        }

        // Find and print minimum element
        int minElement = findMin();
        System.out.println("Minimum element: " + minElement);

        sc.close();
    }
}