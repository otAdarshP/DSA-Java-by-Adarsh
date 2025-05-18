package InsertionSort;

import java.util.Arrays;

public class Main {
    public static void main (String[] args){
        int[] arr = {5, -32, 1, 3, 2};
        selection(arr);
        System.out.println (Arrays.toString(arr));
    }

    static void selection (int [] arr){
        for (int i = 0; i < arr.length - 1; i++){ // the pass (outer) loop
            for (int j = i + 1; j > 0; j--) { // the inner (selection loop
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void swap (int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
