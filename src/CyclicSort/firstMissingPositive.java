package CyclicSort;

class firstMissingPositive {
    public int MissingPositiveFirst(int[] nums) {
        int index = 0;

        while (index < nums.length){
            int correctIndexElement = nums[index] - 1;
            if ( nums[index] > 0 && nums[index] <= nums.length  && nums[index] != nums[correctIndexElement]){
                swap(nums, index, correctIndexElement);
            }
            else{
                index++;
            }
        }
        for (index = 0; index < nums.length; index++){
            if (nums[index] != index+1){
                return index + 1;
            }
        }
        return nums.length + 1; // when alll values are present but still we have to find the next element
    }

    private static void swap (int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
