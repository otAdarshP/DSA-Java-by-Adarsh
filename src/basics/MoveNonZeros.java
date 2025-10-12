package basics;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNonZeros {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n = input.nextInt(); // size
        int[] nums = new int[n]; // input val

        for (int i = 0; i < nums.length;i++){
            nums[i] = input.nextInt();
        }

        moveZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeros (int[] nums){

        int Position = 0;

        for (int i = 0; i < nums.length ; i++){
            if (nums[i] !=0){
                nums[Position] = nums[i];
                Position++;
            }
        }

        while (Position < nums.length){
            nums[Position++] = 0;
        }
    }
}


//        int[] nums = {0,3,2,4,0,0,7,8};
