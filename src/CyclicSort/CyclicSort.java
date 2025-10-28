package CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main (String [] args){
        int [] arr = {5,4,3,2,1};
        CycleSorting(arr);
        System.out.println (Arrays.toString(arr));
    }

    static void CycleSorting(int[] arr){
        int i = 0;
        while ( i < arr.length ){
            int correctIndexPosition = arr[i] - 1;
            if (arr[i] != arr[correctIndexPosition]){
                swap(arr, i, correctIndexPosition);
            }
            else{
                i++;
            }
        }
    }
    static void swap (int[]arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
