package StacksAndQueues;

public class stackClass {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    public static class stack {
        public static Node head;

        public static boolean isEmpty(){
            return head == null;
        }

        public static void push (int data){
            Node newNode = new Node (data);
            if (!isEmpty()){
                newNode.next = head;
                head = newNode;
                return;
            }
            head = newNode;
            return;
        }

        public static int pop (){
            if (isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek (){
            if (isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
}
