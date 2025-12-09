package CollectionsFramework;
import java.util.*;

// hashset and treeset have same operations, just that the treeset is storing data in form of binary search tree
// linkedhashset maintains the order, whereas hashset doesn't. it stores and returns in random order.

public class LearnHashSet {
    public static void main (String[] args){

        HashSet <Integer> hashset = new HashSet<>();
        TreeSet <Integer> treeSet = new TreeSet<>();
        LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();

        hashset.add(30);
        hashset.remove(30);

        hashset.contains(30);
        hashset.isEmpty();
        hashset.size();
        hashset.clear();
    }
}
