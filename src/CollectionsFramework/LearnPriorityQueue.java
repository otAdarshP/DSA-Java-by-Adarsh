package CollectionsFramework;
import java.util.*;

public class LearnPriorityQueue {
    public static void main (String[] args){

        // Implementing a queue using priority / conditions
        // two ways of implementing the Priority Queues:
        //      - Ascending Order (MinHeap)      - Descending Order (MaxHeap)

        // minHeap
        PriorityQueue <Integer> minpq = new PriorityQueue<>();

        minpq.offer(1);
        minpq.poll();
        minpq.peek();

        // maxHeap
        PriorityQueue <Integer> maxpq = new PriorityQueue<>(Comparator.reverseOrder());

        maxpq.offer(30);
        maxpq.poll();
        maxpq.peek();

    }
}
