package Recursion;

public class SumOfArrayDigits {
    public static void main (String[] args){
        int [] nums = {1,2,90,4};
        int index = 0;
        int answer = sumOfDigits(nums, 0);
        System.out.println(answer);

    }
    static int sumOfDigits(int[] nums, int index){
        if (index == nums.length){
            return 0;
        }

        return nums[index] + sumOfDigits(nums, index + 1);
    }
}
