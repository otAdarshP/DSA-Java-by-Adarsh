package RecursionArrays;

public class RotatedBinarySearch {
    public static void main (String [] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int target = 8;
        int asnwerReturn = answerSearch(arr, target, 0, arr.length -1);
        System.out.println(asnwerReturn);
    }
    public static int answerSearch (int [] arr, int target, int start, int end){
        if (start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == arr[target]){
            return mid;
        }

        if (arr[start]<arr[mid]) {
            if (arr[start] >= arr[mid] && arr[mid] == target) {
                return answerSearch(arr, target, start, mid - 1);
            } else {
                return answerSearch(arr, target, start + 1, end);
            }
        }
        if (arr[mid] == target && target <= arr[end]) {
            return answerSearch(arr, target, start, mid - 1);
        } else {
            return answerSearch(arr, target, start + 1, end);
        }
    }
}
