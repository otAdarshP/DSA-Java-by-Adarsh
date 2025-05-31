package CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main (String [] args){
        int [] arr = {5,4,3,2,1};
        CycleSorting(arr);
        System.out.println (Arrays.toString(arr));
    }

    static void CycleSorting (int[] arr){
        int i = 0;
        while (i < arr.length){
            int CorrectIndexedValue = arr[i] - 1;
            if (arr[i] != arr[CorrectIndexedValue]){
                swap (arr,  i, CorrectIndexedValue);
            }
            else{
                i++;
            }
        }
    }

    static  void swap (int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
