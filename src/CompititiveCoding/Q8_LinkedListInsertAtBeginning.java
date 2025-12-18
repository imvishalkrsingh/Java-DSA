package CompititiveCoding;

import java.util.*;

public class Q8_LinkedListInsertAtBeginning {

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

    // Function to insert at beginning
    static void insertAtBeginning(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    // Function to display linked list
    static void displayList() {
        System.out.println("Linked List Elements:");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (-1 to stop):");

        while (true) {
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            insertAtBeginning(num);
        }

        displayList();
        sc.close();
    }
}