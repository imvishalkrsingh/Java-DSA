package LinkedList;

public class Implementation {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedList1{
        Node head = null;
        Node tail = null;

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

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            Node temp = head;
            while (temp != null){

            }
            return 0;
        }
    }
    public static void main(String[] args) {
        linkedList1 ll = new linkedList1();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtHead(1);
        ll.display();
    }
}
