package RecursionPermutation;

//Given an array nums of distinct integers, return all the possible permutations.
//You can return the answer in any order.
//        Example 1:
//
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//Example 2:
//
//Input: nums = [0,1]
//Output: [[0,1],[1,0]]
//Example 3:
//
//Input: nums = [1]
//Output: [[1]]

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main (String[] args){
        int [] arr = {1,2,3};
        List<List<Integer>> permutationList = new ArrayList<>();
        permute (arr, permutationList, new ArrayList<>());

        for (List<Integer> perms : permutationList){
            System.out.println(perms);
        }
    }
    public static void permute (int[]arr, List<List<Integer>> permutationList, List<Integer> list){
        if (list.size() == arr.length){
            permutationList.add(new ArrayList<>(list));
            return;
        }

        for (int n : arr){
            if (list.contains(n)){
                continue;
            }
            list.add(n);
            permute (arr, permutationList, list);
            list.remove(list.size() - 1);
        }

    }
    
}
