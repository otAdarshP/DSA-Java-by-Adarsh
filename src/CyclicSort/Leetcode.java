package CyclicSort;

//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.Arrays;

public class Leetcode {
    public static void main (String[] args){
        int [] nums = {1,2,3,4,3,2,6,7,8};
        CyclicSorting (nums);
        ArrayOfElements(nums);
        System.out.println (Arrays.toString(nums));
        System.out.println (Arrays.toString(nums));
    }

    static void CyclicSorting (int[] nums){
        int i = 0;
        while (i < nums.length){
            int correctIndexedValue = nums[i] - 1;

            if (nums[i] < nums.length && nums[i] != nums[correctIndexedValue]){
                swap(nums, i, correctIndexedValue);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

    static void ArrayOfElements (int[] arr){
        int j = 0;
        if ()
    }
}
