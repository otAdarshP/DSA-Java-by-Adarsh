package SortingUsingRecursion;

import java.util.Arrays;

public class QuickSortRecursion {
    public static void main (String[] args){
        int[] arr= {10, 8, 7, 4, 9, 6, 5, 3, 1, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high){
//        base case:
        if (low >= high){
            return;
        }

        int startSwapping = low;
        int endSwapping = high;
        int mid = startSwapping + (endSwapping-startSwapping)/2;
        int pivot = arr[mid];

        while (startSwapping<=endSwapping){
            while (arr[startSwapping] < pivot){
                startSwapping++;
            }
            while (arr[endSwapping] > pivot){
                endSwapping--;
            }
            if (startSwapping <= endSwapping){
                int temp = arr[startSwapping];
                arr[startSwapping] = arr[endSwapping];
                arr[endSwapping] = temp;
                startSwapping++;
                endSwapping--;
            }
        }
        sort (arr, low, endSwapping);
        sort (arr, startSwapping, high);
    }
}
