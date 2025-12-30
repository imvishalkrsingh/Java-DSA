/* ✅ DAY 20 — Count Number of Nodes in a Doubly Linked List

You are given some numbers.
Store these numbers in a doubly linked list.
The input will stop when -1 is entered.
Do not store -1 in the linked list.
Your task is to count and print the total number of nodes present in the doubly linked list.
Sample Input : 
10 20 30 40 50
*/

package CompititiveCoding;

import java.util.*;

public class Q20_CountNodesDoublyLinkedList {

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

    // Count number of nodes
    static int countNodes() {
        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter elements (-1 to stop):");

        while (true) {
            int val = sc.nextInt();

            if (val == -1)
                break;

            insertAtEnd(val);
        }

        // Count and display nodes
        int totalNodes = countNodes();
        System.out.println("Total number of nodes: " + totalNodes);

        sc.close();
    }
}