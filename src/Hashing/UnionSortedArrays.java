package Hashing;
import java.util.*;

public class UnionSortedArrays {
    public static void main (String[] args){
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};
        int[] union = unionArray (nums1, nums2);
        System.out.println(Arrays.toString(union));
    }
    public static int[] unionArray(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums1){
            set.add(num);
        }
        for (int nums : nums2){
            set.add(nums);
        }

        // list for the final set
        List<Integer> list = new ArrayList<> (set);
        Collections.sort (list);

        // creating an int for the list

        int [] result = new int [list.size()];
        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
