package CyclicSort;

//Given an array nums of n integers where nums[i] is in the range [1, n],
// return an array of all the integers in the range [1, n] that do not appear in nums.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
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
        // finding the missing values
        List<Integer> answer = new ArrayList<>();
        for (i = 0; i < nums.length; i++){
            if (nums[i] != i+1){
                answer.add (i + 1);
            }
        }
        return answer;
    }
    private static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
