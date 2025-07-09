package Hashing;
import java.util.*;

public class HashMaps {
    public static void main (String[] args){
        
//        creation of a HashMap:
        HashMap<String, Integer> map = new HashMap<> ();
        
//        insertion in a HashMap;
        map.put("India", 150);
        map.put("China", 130);
        map.put("USA", 35);
        map.put("UK", 15);
        
//        returning the data of the map:
        System.out.println (map); // {USA=35, China=130, UK=15, India=150}

//        updates the existing key's value and add a new key and its value:
        map.put("India", 155);
        map.put("Pakistan", 40);
        System.out.println(map); // {USA=35, Pakistan=40, China=130, UK=15, India=155}
        
//        Searching: 
//        EXISTENCE OF A KEY -
        if (map.containsKey("China")){
            System.out.println("Yes, it exists for look-up"); // Yes, it exists for look-up
        }
        if (!map.containsKey("Indonesia")){
            System.out.println("No, the key doesn't exist in the map for look-up"); // No, the key doesn't exist in the map for look-up
        }
        
//        checking the VALUE of the KEY if exists (part of the Searching method):
        System.out.println(map.get("India")); // 155
        System.out.println(map.get("Nepal")); // null
        
//        Traversal / Iteration:
        for (Map.Entry<String, Integer> element : map.entrySet()){
//            null
//            USA
//            35
//            Pakistan
//            40
//            China
//            130
//            UK
//            15
//            India
//            155
            System.out.println(element.getKey());
            System.out.println(element.getValue());
        }

//        Only to get keys:
        Set <String> keys = map.keySet();
        for (String key : keys){
            System.out.println("key:" + map.get(key));
//              key:35
//              key:40
//              key:130
//              key:15
//              key:155
        }

//        Removal:
        map.remove("UK");
        System.out.println(map); // {USA=35, Pakistan=40, China=130, India=155}
    }
}
