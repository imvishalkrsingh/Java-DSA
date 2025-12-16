/*
Problem Statement: You are maintaining a student roll number database using a singly linked list.
Initially, the system receives a list of roll numbers ending with -1 (do not store -1).

Enter initial linked list elements (end with -1):
10 20 30 -1
Enter operations:
1 X   -> Insert X at beginning
2 X   -> Insert X at end
3 P X -> Insert X at position P
-1    -> Stop operations
1 5
2 40
3 2 15
-1


Sample input : 
10 20 30 -1
1 5
2 40
3 2 15
-1

 */

package CompititiveCoding;

import java.util.*;

public class Q6_LinkedListInsertion {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;

    // Insert at beginning
    static void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    static void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newNode;
    }

    // Insert at position P (1-based)
    static void insertAtPosition(int pos, int data) {
        if (pos <= 0)
            return;

        if (pos == 1) {
            insertBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++)
            temp = temp.next;

        if (temp == null)
            return;

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Print linked list
    static void printList() {
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

        // 👉 User instruction for initial list
        System.out.println("Enter initial linked list elements (end with -1):");

        while (true) {
            int val = sc.nextInt();
            if (val == -1)
                break;
            insertEnd(val);
        }

        // 👉 User instruction for operations
        System.out.println("Enter operations:");
        System.out.println("1 X   -> Insert X at beginning");
        System.out.println("2 X   -> Insert X at end");
        System.out.println("3 P X -> Insert X at position P");
        System.out.println("-1    -> Stop operations");

        while (true) {
            int op = sc.nextInt();

            if (op == -1)
                break;
            else if (op == 1) {
                int x = sc.nextInt();
                insertBeginning(x);
            } else if (op == 2) {
                int x = sc.nextInt();
                insertEnd(x);
            } else if (op == 3) {
                int pos = sc.nextInt();
                int x = sc.nextInt();
                insertAtPosition(pos, x);
            }
        }

        printList();
        sc.close();
    }
}