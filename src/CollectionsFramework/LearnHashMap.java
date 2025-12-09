package CollectionsFramework;
import java.util.*;

public class LearnHashMap {
    public static void main (String[] args){
         // we have 2 things:
        //      - HashMap       - TreeMap
        // the only difference between hashmap and treemap is that the treemap stores info in sorted order

        HashMap <Integer, String> newMap = new HashMap<>();

        newMap.put (1, "One");
        newMap.put (2, "Two");

        if (!newMap.containsKey(2)){
            newMap.put (2, "Two");
        }
        // OR
        newMap.putIfAbsent(2, "Two");


        // ITERATE THROUGH A HASHMAP

        for (Map.Entry<Integer, String> e : newMap.entrySet()){
            e.getKey();
            e.getValue();
        }

        // OR

        for (int key : newMap.keySet()){
            newMap.containsValue("Two");
        }
    }
}
