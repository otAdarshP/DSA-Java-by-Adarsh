package Recursion;

public class ProdOfNums {
    public static void main (String[] args){
        int nums = 1234;
        int ans = prodArray(nums);
        System.out.println(ans);

    }
    static int prodArray (int nums){
        if (nums % 10 == 0){
            return 1;
        }

        return nums % 10 * prodArray(nums / 10 );
    }
}
