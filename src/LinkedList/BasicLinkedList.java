package LinkedList;

public class BasicLinkedList {

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void displayR(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " ");
        displayR(head.next);
    }

    public static void func(Node head){
        if(head == null) return;
        func(head.next);
        System.out.print(head.data + " ");
    }

    // Length method in linked list
    public static int lengthLL(Node head){
        int count = 0;
        while (head != null){
            count++;
            head = head.next;
        }
        return count;
    }

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
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Data of a : " + a.data);
        System.out.println("Data of b : " + a.next.data);
        System.out.println("Data of c : " + a.next.next.data);
        System.out.println("Data of d : " + a.next.next.next.data);
        System.out.println("Data of e : " + a.next.next.next.next.data);

        Node temp = a;

        // Using for loop when the size of Linked list is known
//        for (int i = 1; i <=5; i++){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        // using while loop when the size of linked list in not known
//        while (temp != null){
//            System.out.print(temp.data + " ");
//            temp = temp.next;
//        }

        System.out.println("Print Iterative function");
        display(a);
        System.out.println();
        System.out.println("Print Recursively function");
        displayR(a);
        System.out.println();
        System.out.println("Print Linked list in reverse order : ");
        func(a);
        System.out.println();
        System.out.println("Length of Linked list : ");
        System.out.println(lengthLL(a));

    }
}
