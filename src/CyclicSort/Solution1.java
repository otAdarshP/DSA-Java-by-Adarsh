package CyclicSort;

//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums and using only constant extra space.


class Solution1 {
    public int findDuplicate(int[] nums) {

        int index = 0;
        while (index < nums.length) {
            int correctIndexElement = nums[index] - 1;
            if (nums[index] <= nums.length && nums[index] != nums[correctIndexElement]) {
                swap(nums, index, correctIndexElement);
            } else {
                index++;
            }
        }

        for (index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return nums[index];
            }
        }
        return -1;
    }

    private static void swap (int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}