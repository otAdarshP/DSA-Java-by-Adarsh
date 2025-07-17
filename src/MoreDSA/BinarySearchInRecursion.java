package MoreDSA;

public class BinarySearchInRecursion {
    public static void main (String[] args){
        int[] arr = {6, 7, 8, 12, 34, 45, 65, 76};
        int target = 65;
        System.out.println (search(arr, target, 0, arr.length-1));
    }

    private static int search(int[] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        else{
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                return search (arr, target, mid+1, end);
            }
            else{
                return search (arr, target, start, mid-1);
            }
        }

    }
}
