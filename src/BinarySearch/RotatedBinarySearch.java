package BinarySearch;

public class RotatedBinarySearch {
    public static void main (String[] args){
        int [] arr = {6,7,8,9,1,2,3,4,5};
        int target = 43;
        int answer = RotatedSearch(arr, target, 0, arr.length - 1);
        System.out.println (answer);
    }

    public static int RotatedSearch (int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }

        while (end >= start){
            int mid = start + (end - start) /2;

            if (arr[mid] == target){
                return mid;
            }

            if (arr[mid] < target && target <= arr[end]){
                start = mid + 1;
            }
            if (arr[mid] >= target && target <= arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return RotatedSearch(arr, target, start, end);
    }
}
