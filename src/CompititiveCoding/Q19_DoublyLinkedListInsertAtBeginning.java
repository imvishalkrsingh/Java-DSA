/* You are given some numbers.
Store these numbers in a doubly linked list.
Your task is to:
	•	Insert each element at the beginning of the doubly linked list
	•	Display the elements from left to right
👉 Since insertion is at the beginning, the final list will appear in reverse order of input.

Sample Input : 
5
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q19_DoublyLinkedListInsertAtBeginning {

    // Node structure for Doubly Linked List
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;
    static Node tail = null;

    // Insert node at beginning
    static void insertAtBeginning(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Display list from left to right
    static void displayForward() {
        System.out.println("Doubly Linked List Elements:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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
            insertAtBeginning(val);
        }

        // Display doubly linked list
        displayForward();

        sc.close();
    }
}