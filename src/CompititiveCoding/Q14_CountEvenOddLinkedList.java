/* You are given some numbers.
Store these numbers in a singly linked list.
Your task is to:
	•	Count how many even numbers are present
	•	Count how many odd numbers are present
Finally, print the count of even and odd elements.

Sample Input : 
6
10 15 20 25 30 35
*/


package CompititiveCoding;

import java.util.*;

public class Q14_CountEvenOddLinkedList {

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

        // Ask user for number of elements
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        // Ask user for elements
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            insertAtEnd(val);
        }

        // Count and print even & odd
        countEvenOdd();

        sc.close();
    }
}