package LinkedList;

public class Main{
    public static void main (String[] args){
        LL list = new LL();
        list.addFirst(3);
        list.addFirst(3);
        list.addFirst(5);
        list.addFirst(3);
        list.addLast(5);
        list.addLast(7);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());


    }
    
}
