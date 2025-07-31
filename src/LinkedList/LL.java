package LinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

    LL(){
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
        }
        public Node (int data, Node next){
            this.data = data;
            this.next = next;
        }

    }

    // add at first;
    public void addFirst (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // add at last:
    public void addLast (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    // display
    public void display (){
        if (head == null){
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.print (temp.data + " ->");
            temp = temp.next;
        }
        System.out.println ("END");
    }

    // delete at first:
    public void deleteFirst (){
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete at last:
    public void deleteLast (){
        // base case:
        if (head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node last = head.next;
        while (last.next != null){
            secondLast = secondLast.next;
            last = last.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }
}
