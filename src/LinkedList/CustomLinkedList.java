package LinkedList;

// Outer class:
public class CustomLinkedList {

    // Instance variables:
    private Node head;
    private Node tail;
    private int size;

    // Constructor of outer class:
    public CustomLinkedList(){
        this.size = 0;
    }

    // Inner class. Represents the node inside the Linked List
    public class Node {

        // Nodes data fields:
        private int data;
        private Node next;

        // Constructor of node class
        public Node (int data){
            this.data = data;
        }

        // Constructor of node class with data and next:
        public Node (int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    // Insertion at the 1st place in the LinkedList:
    public void insertFirst (int val){
        Node node = new Node (val);
        node.next = head;
        head = node;

        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    // Display of the list:
    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    // Inserting at the end:
    public void InsertEnd (int data){
        if (tail == null){
            insertFirst(data);
            return;
        }
        Node node = new Node (data);
        tail.next = node;
        node = tail;
    }

    // Inserting at random postion:
    public void Insert (int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            InsertEnd(val);
            return;
        }
        // **
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node (val, temp.next);
        temp.next = node;
        size++;
    }

}
