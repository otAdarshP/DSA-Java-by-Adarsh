package CollectionsFramework;
import java.util.*;

public class LearnQueue {
    public static void main (String[] args){

        // a queue can be implemented using the following data structures:
        //  - ArrayList     - LinkedList    - PriorityQueue

        Queue <String> names = new LinkedList<>();


        // add ".offer()"
        names.offer ("Adviath");
        // we could also use a ".add()" but this might result in exception to an empty list/

        // delete ".poll()"
        names.poll();


        // view ".peek()"
        names.peek(); // shows the topmost value in the queue
    }
}
