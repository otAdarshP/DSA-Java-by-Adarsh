package SelectionSort;

import java.util.Arrays;

import static java.util.Collections.swap;

public class Main {
    public static void main (String[] args){
        int[] arr = {3, 4, -3   , 1, 3};
        selectMaxValueElement(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectMaxValueElement (int [] arr){
        for (int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
//            we find the maxValueIndex and the last index and then swap the values inside the indexes.
            int maxValueIndex = getMaxValueIndex(arr, 0, last + 1);
            swap (arr, maxValueIndex, last);
        }
    }

    static void swap (int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
    }

    static int getMaxValueIndex (int[] arr, int start, int end) {
        int maxValueIndex = start;
        for (int i = start; i < end; i++){
            if (arr[i] > arr[maxValueIndex]){
                maxValueIndex = i;
            }
        }
        return maxValueIndex;
    }
}
