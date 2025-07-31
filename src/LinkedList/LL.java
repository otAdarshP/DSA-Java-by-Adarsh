package LinkedList;

public class LL {
    Node head;
    Node tail;
    int size;

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
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add at last:
    public void addLast (int data){
        Node newNode = new Node (data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp.next = temp;
        }
        temp.next = newNode;
    }

    // display
    public void display (LL data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp != null){
            System.out.println (temp.data + " ->");
        }
        System.out.println ("END");


    }
}
