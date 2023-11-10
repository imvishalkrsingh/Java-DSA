package LinkedList;

public class linkedList{
    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static int size;

    public void addFirst(int data){
        // step 1 : Create new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 : newNode next = head
        newNode.next = head; // link

        // step 3 : head = newNode
        head = newNode;
    }

    public void addLast(int data){
        // step 1 :
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        // Step 2 :
        tail.next = newNode;

        // step 3 :
        tail = newNode;
    }

    public void print(int data) {
        System.out.print(data + " ");
    }

    public void printLL(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in the middle
    public void addMid(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx -1){
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove first
    public int removeFirst(){
        if(size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.addFirst(1);
        l1.addMid(1,9);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addMid(4,9);

        l1.printLL();
        System.out.println("size of Linked List : " + l1.size);

        l1.removeFirst();
        l1.printLL();
    }
}