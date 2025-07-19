package SortingUsingRecursion;

import java.util.Arrays;

public class MergeSortRecursionWay1 {
    public static void main (String [] args){
        int [] arr = {3,5,4,8,6,7};
        returnMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void returnMergeSort (int[] arr, int start, int end){
        int mid = start + (end - start) / 2;
        // base condition
        if (start >= end){
            return;
        }
        // recursing through the left half of the array:
        returnMergeSort (arr, start, mid);
        // recursing through the left half of the array:
        returnMergeSort(arr, mid + 1, end);
        // return the combined merged array:
        merge (arr, start, mid, end);
    }

    public static void merge (int[] arr, int start, int mid, int end){
        // create a temp array to store the values of the merge:
        int [] temp = new int [end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end){
            if (arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            if (arr[j] <= arr[i]){
                temp[k++] = arr[j++];
            }

            while (i <= mid){
                temp[k++] = arr[i++];
            }
            while (j <= end){
                temp[k++] = arr[j++];
            }
        }
        // sending back the values from temp to the original array;
        for (int m = 0; m < temp.length; m++){
            arr[start+m] = temp[m];
        }
    }
}
