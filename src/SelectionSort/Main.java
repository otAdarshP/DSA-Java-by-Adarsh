package SelectionSort;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Main {
    public static void main (String[] args){
        int[] arr = {3, 4, -3, 1, 3};
        selectMaxElement(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectMaxElement (int [] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
//            we find the maxIndex and the last index and then swap the values inside the indexes.
            int maxIndex = getMaxIndex(arr, 0, last + 1);
            swap (arr, maxIndex, last);
        }
    }

    static void swap (int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }

    static int getMaxIndex (int[] arr, int start, int end) {
        int maxIndex = start;
        for (int i = start; i < end; i++){
            if (arr[i] > arr[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
