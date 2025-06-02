package CyclicSort;
//You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately,
// due to some error, one of the numbers in s got duplicated to another number in the set,
// which results in repetition of one number and loss of another number.
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.


import java.util.ArrayList;
import java.util.List;

public class findErrorSum {
    public int[] findErrorNums(int[] nums) {
        int index = 1;
        while (index < nums.length){
            int correctIndexElement = nums[index] - 1;
            if (nums[index] != nums[correctIndexElement]){
                swap (nums, index, correctIndexElement);
            }
            else{
                index++;
            }
        }

        for (index = 0; index < nums.length; index ++){
            if (nums[index] != index + 1){
                return new int [] {nums[index], index+1};
            }
        }
        return new int [] {-1, -1};
    }

    private static void swap (int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
