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
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            Node temp = head;
            while (temp != null){

            }
        }
    }
    public static void main(String[] args) {
        linkedList1 ll = new linkedList1();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.display();

    }
}
