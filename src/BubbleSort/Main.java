package BubbleSort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){

        int[] nums = {3, 1, 4, 2, 5};

//      calculates the total iterations over the arrays: "runs 'nums - 1' times"
        for (int i = 0; i < nums.length; i++){

//          for each iteration, maximum item will come at the last stop
            for (int j = 1; j < nums.length - i; j++){

//              swaps the elements when the "j-1" is > than "j"
                if (nums[j] < nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
