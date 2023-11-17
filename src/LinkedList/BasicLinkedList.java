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
        System.out.println("Data of x : " + x.data);


        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);

        // 5 -> 3 -> 9 -> 8 -> 16
        a.next = b;
        System.out.println("Data of a : " + a.data);
        System.out.println(a.next);
        System.out.println("Data of b : " + a.next.data);

    }
}
