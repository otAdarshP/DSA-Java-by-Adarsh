package LinkedList;
import java.util.*;

public class LinkedListCollections {
    public static void main (String [] args){
        LinkedList<String> list = new LinkedList<>();
        
        // collection framework
        
        list.addFirst ("I ");  //3
        list.add ("am ");//2
        list.addLast ("Adarsh "); //1
        list.addFirst ("Priyadarshi "); //0
        System.out.println(list.get(1));
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        list.removeLast();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            i++;
        }
        
        
    }

}
