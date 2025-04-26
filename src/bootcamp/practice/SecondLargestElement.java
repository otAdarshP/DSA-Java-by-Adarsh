package bootcamp.practice;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main (String [] args){
        int [] arr = {39,34,56,28,19,37,23,15,51,10,67,90,89,92,11,15,44,88,87,69,36,29,1,2,3};
        int k = 5;

        for (int i = 0; i < arr.length; i++){
            int [] window = Arrays.copyOfRange(arr, i, i+k);
            Arrays.sort(window);
            System.out.println(window[k-2]);
        }
    }
}
