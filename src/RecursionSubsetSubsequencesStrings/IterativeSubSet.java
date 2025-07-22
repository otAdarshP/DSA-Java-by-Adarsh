package RecursionSubsetSubsequencesStrings;

import java.util.*;

public class IterativeSubSet {
    public static void main (String [] args){
        int [] arr = {1,2,3};
        // creating a list of list of ans to hold the values of the subset(arr)
        List<List<Integer>> ans = subSet(arr);
        // iterating through the list of answer
        for (List<Integer> list : ans){
            // printing the answer
            System.out.println(list);
        }
    }

    public static List<List<Integer>> subSet (int[] arr){
        // the main set which will consist of all ub sets
        List<List<Integer>> outer = new ArrayList<>();
        // creating a new set inside and adding to the outer set
        outer.add(new ArrayList<>());
        // iterating through the list of integers
        for (int num : arr){
            // holding the size of previous set, to stop duplicates
            int n = outer.size();

            for (int i = 0; i < n; i++){
                // adding the existing number from outer to the new internal list
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // adding the number to the internal list
                internal.add(num);
                // adding the internal list to the outer list
                outer.add(internal);
            }
        }
        return outer;
    }
}
