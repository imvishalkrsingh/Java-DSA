/* DAY 15 — Find Sum of All Elements in a Singly Linked List (Easy Level)
📝 Problem Statement (Beginner Friendly)
You are given some numbers.
Store these numbers in a singly linked list.
Your task is to find and print the sum of all elements present in the linked list.
📥 Sample Input :
5
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q15_SumOfElementsLinkedList {

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

    // Calculate sum of elements
    static int calculateSum() {
        int sum = 0;
        Node temp = head;

        while (temp != null) {
            sum += temp.data;
            temp = temp.next;
        }

        return sum;
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

        // Calculate and print sum
        int totalSum = calculateSum();
        System.out.println("Sum of elements: " + totalSum);

        sc.close();
    }
}