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

    // Recursive method to reverse the list
    public Node reverseRecursive(Node head) {
        // base condition:
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    // reverse a list using iteration

    public static Node iterativeReverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        prev.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // update the nodes:
            prev = curr;
            curr = next;
        }
        return prev;
    }

// question 143

    public static Node mid (Node head){
        Node slow = head;
        Node fast = head;


        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public static Node reverse (Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = head;
        Node curr = head.next;
        prev.next = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            // update
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reOrderList (Node head){
        if (head == null || head.next == null){
            return;
        }

        Node middle = mid(head);
        Node secondHead = reverse(middle.next);
        middle.next = null;
        Node firstHead = head;

        while (secondHead != null) {
            Node tempHead1 = firstHead.next;
            Node tempHead2 = secondHead.next;

            firstHead.next = secondHead;
            secondHead.next = tempHead1;

            firstHead = tempHead1;
            secondHead = tempHead2;
        }
    }


}
