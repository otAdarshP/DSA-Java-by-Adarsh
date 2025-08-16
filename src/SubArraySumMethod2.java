public class SubArraySumMethod2 {
    public static void main (String [] args){
        int [] nums = {5,3,-1,4};
        int target = 3;
        int ans = subArray(nums, target);
        System.out.println(ans);
    }
    public static int subArray (int[] nums, int target){
        int count = 0;
        int [] prefix = new int [nums.length+1];
        prefix[0] = 0;

        for (int k = 1; k <= nums.length; k++){
            prefix[k] = prefix[k-1] + nums[k-1]; // this builds the prefix array
        }

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (prefix[j+1] - prefix[i] == target){
                    count++;
                }
            }
        }
        return count;
    }
}
