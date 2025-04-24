package twoPointer_SlidingWindow;

public class twoSum {
    public static void main (String[] args){
        int [] arr = {3, 7, 9, 10, 15, 30};
        int k = 17;
        System.out.println (isPresent(arr, k));
    }
// if given that the array is sorted, we can use the Binary Search as well.

//    this is the SHRINK PATTERN
    public static boolean isPresent(int[] arr, int k){
        for (int i = 0; i < arr.length; i++){
            for (int j = arr.length - 1; j > 0; j--){
                if (arr[i] + arr[j] == k){
                    return true;
                }
            }
        }
        return false;
    }
}
