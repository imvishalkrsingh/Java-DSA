package LinkedList;

public class BasicLinkedList {

    public static class Node {
        int data;
        Node next;

        // Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Creating a new node with data 42
        Node x = new Node(42);
        System.out.println(x.data);
    }
}
