package Recursion;

public class BinarySearch {
    public static void main (String[] args){
        int target = 4;
        int [] arr = {1,2,3,4,6,7,8,9};
        System.out.println(binarySearching(arr, target, 0, arr.length - 1));
    }
    static int binarySearching (int [] arr, int target, int start, int end){
//        base condition
        if (start > end){
            return -1;
        }
//        main recursive solution
        int mid = start + (end - start)  / 2;
         if (arr[mid] == target){
             return mid;
         }
         if (arr[mid] > target){
             return binarySearching(arr, target, start, mid - 1);
         }
         else{
             return binarySearching(arr, target, mid+1, end);
         }
    }
}
