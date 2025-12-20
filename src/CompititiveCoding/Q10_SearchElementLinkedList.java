/*You are given some numbers.
Store these numbers in a singly linked list.

The input will stop when -1 is entered.
Do not store -1 in the linked list.

After creating the linked list, enter a number to search.
If the number is found in the linked list, print “Element Found”,
otherwise print “Element Not Found”.

Sample Input : 10 20 30 40 -1
30
 */

package CompititiveCoding;

import java.util.*;

public class Q10_SearchElementLinkedList {

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

    // Search element
    static boolean searchElement(int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
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

        System.out.println("Enter element to search:");
        int key = sc.nextInt();

        if (searchElement(key)) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element Not Found");
        }

        sc.close();
    }
}