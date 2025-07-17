package RecursionArrays;

public class LinearSearchRecursion {
    public static void main (String[] args){
        int [] nums = {1,2,3,4,66,7,9};
        int target = 66;
        System.out.println(searchValue(nums, 0, target));
        System.out.println(searchLastValue(nums, nums.length -1, target));

    }
    public static int searchValue (int [] nums, int index, int target){
//         base condition;
        if (index == nums.length - 1 && index != target){
            return 0;
        }

        if (nums[index] == target){
            return index;
        }

        return searchValue(nums, index+1, target);
    }

    public static int searchLastValue (int[] nums, int index, int target){
        if (index == -1){
            return -1;
        }

        if (nums[index] == target){
            return index;
        }

        return searchLastValue(nums, index - 1, target);
    }
}
