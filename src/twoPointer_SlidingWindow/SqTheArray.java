package twoPointer_SlidingWindow;

import java.util.Arrays;

public class SqTheArray {
    public static void main (String[] args){
        int[] arr = {-3, -1, 0, 2, 5};
        int [] answer = SquareArray(arr);
        System.out.println(Arrays.toString(answer));
    }
    static int[] SquareArray(int[] arr){
        int start = 0;
        int [] result = new int [arr.length];
        int end = arr.length - 1;
        int index = arr.length - 1;

        while (start < end){
            int startSq = arr[start] * arr[start];
            int endSq = arr[end] * arr[end];

            if (startSq <= endSq){
                result[index--] = endSq;
                end--;
            }
            else{
                result[index--] = startSq;
                start++;
            }
        }
        return result;
    }
}
