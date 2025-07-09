package Hashing;
import java.util.HashSet;
import java.util.Iterator;

public class HashSets {
    public static void main (String[] args){
//        creating a HashSet
        HashSet<Integer> set = new HashSet<>();

//        inserting in a HashSet
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

//        Searching in a set (use contains):
        if (set.contains(1)){
            System.out.println ("Yes, it exists"); // Yes, it exists
        }
        if (!set.contains(5)){
            System.out.println("Doesn't exist in the set"); // Doesn't exist in the set
        }

//        Deletion in a HashSet:
        set.remove(3);
        System.out.println(set); //[1,2,4]
        if (!set.contains(3)){
            System.out.println ("The number has been deleted from the set"); // The number has been deleted from the set
        }

//        Size of the complete hashset:
        System.out.println ("The size of the set is: " + set.size()); // The size of the set is: 3

//        printing all the elements in the hashset:
        System.out.println (set); // [1, 2, 4]

//        declaring an ITERATOR (LOOPING THROUGH THE HASHSET):
        Iterator it = set.iterator();

//        using an iterator:

        while (it.hasNext()){
            System.out.println(it.next()); // 1 2 4
        }

        if (it.hasNext()){
            System.out.println(it.next()); // *because of above while loop, this won't return anything
        }
        if (!it.hasNext()){
            System.out.println ("The values in the set are over."); // The values in the set are over.
        }
    }


}
