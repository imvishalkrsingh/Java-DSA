/*
DAY 30 — Check if a Doubly Linked List is Palindrome (Intermediate Level)

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.

Check whether the doubly linked list is a palindrome.

Sample Input:
10 20 30 20 10 -1
*/

package CompititiveCoding;

import java.util.*;

public class Q30_CheckPalindromeDoublyLinkedList {

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

    // Check palindrome
    static boolean isPalindrome() {
        Node left = head;
        Node right = tail;

        while (left != null && right != null && left != right && right.next != left) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Read elements
        System.out.println("Enter elements (-1 to stop):");
        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertAtEnd(val);
        }

        // Check palindrome and print result
        if (isPalindrome()) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}