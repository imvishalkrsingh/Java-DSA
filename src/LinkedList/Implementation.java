package LinkedList;

public class Implementation {

    // Node class to represent individual elements in the linked list
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // LinkedList class with various operations
    public static class linkedList1{
        Node head = null;
        Node tail = null;

        // Inserting a new node at the end of the linked list
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }
            else {
                tail.next = temp;
            }
            tail = temp;
            tail = temp;
        }
        // Inserting a new node at the beginning of the linked list
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){ // empty list
                head = temp;
                tail = temp;
            }
            else{ // non-empty list
                temp.next = head;
                head = temp;
            }
        }

        // Inserting a new node at a specific index in the linked list
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            for (int i =1; i <= idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        // Displaying the elements of the linked list
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        // Calculating the size of the linked list
        int size(){
            Node temp = head;
            while (temp != null){

            }
            return 0;
        }
    }
    // Main method to test the linked list implementation
    public static void main(String[] args) {
        linkedList1 ll = new linkedList1();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtHead(1);
        ll.display();
        ll.insertAt(1,99);
        ll.display();
    }
}
