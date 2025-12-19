/*Problem Statement : You are given some numbers. Store these numbers in a singly linked list. The input will stop when -1 is entered. Do not store -1 in the linked list.
Your task is to count how many nodes (elements) are present in the linked list and print the count.

Sample input : 
10 20 30 40 -1
 */

package CompititiveCoding;

import java.util.*;

public class Q9_CountNodesLinkedList {

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

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1)
                break;

            insertAtEnd(num);
        }

        int totalNodes = countNodes();
        System.out.println("Total number of nodes: " + totalNodes);

        sc.close();
    }
}