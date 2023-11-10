package LinkedList;

public class linkedList {
    // Node class representing individual elements in the linked list
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Instance variables for the linked list
    private Node head;
    private Node tail;
    private int size;

    // Method to add a new element at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = tail = newNode;
            return;
        }
        // Otherwise, update references to insert the new node at the beginning
        newNode.next = head;
        head = newNode;
    }

    // Method to add a new element at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            // If the list is empty, set both head and tail to the new node
            head = tail = newNode;
            return;
        }
        // Otherwise, update references to insert the new node at the end
        tail.next = newNode;
        tail = newNode;
    }

    // Method to add a new element at a specified index in the linked list
    public void addMid(int idx, int data) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid index for addMid");
            return;
        }

        Node newNode = new Node(data);
        size++;

        if (idx == 0) {
            // If adding at index 0, update references to insert at the beginning
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse the list to find the node at the previous index
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        // Update references to insert the new node at the specified index
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Method to remove the first element from the linked list
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // If there is only one element, remove it and set head and tail to null
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // Otherwise, remove the first element and update head
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // Method to remove the last element from the linked list
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            // If there is only one element, remove it and set head and tail to null
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        } else if (size == 2) {
            // If there are two elements, remove the last and update references
            int val = tail.data;
            head.next = null;
            tail = head;
            size--;
            return val;
        }

        // Traverse the list to find the node at the second-to-last index
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }

        // Remove the last element and update references
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // Method to print the elements of the linked list
    public void printLL() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test the linked list implementation
    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.addFirst(1);
        l1.addMid(1, 9);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addMid(4, 9);

        l1.printLL();
        System.out.println("size of Linked List: " + l1.size);

        l1.removeFirst();
        l1.printLL();

        l1.removeLast();
        l1.printLL();
        System.out.println("size of Linked List: " + l1.size);
    }
}
