public class SubArraySumMethod1 {
    public static void main (String[] args){
        int[] nums = {5,3,-1,4};
        int target = 3;

        int ans = subArray(nums, target);
        System.out.println (ans);
    }
    public static int subArray(int[] nums, int target) {

        // method 1 - nested loop
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                int sum = 0;
                // k runs between the i and j.  
                for (int k = i; k <= j; k++){
                    sum += nums[k];
                }
                if (sum == target){
                    count++;
                }
            }
        }
        return count;
    }
}
