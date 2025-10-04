package CompleteTrees;

public class SegmentTrees {

    class Node{
        int val;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node(int val,  int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
}
