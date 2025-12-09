package CollectionsFramework;
import java.util.*;

// DEQUE is a double ended queue.

public class LearnDeque {
    public static void main (String[] args){

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.offer(40);
        deque.offerFirst(20);
        deque.offerLast(30);

        // similarly for poll and peek

        deque.poll();
        deque.pollFirst();
        deque.pollLast();

        deque.peek();
        deque.peekFirst();
        deque.peekLast();


    }
}
