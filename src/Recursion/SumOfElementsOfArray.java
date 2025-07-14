package Recursion;

import java.util.*;


public class SumOfElementsOfArray {
    public static void main (String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int answer = sumOfArray(arr, 0);
        System.out.println(answer);
    }
//        Recursive Approach
    static int sumOfArray(int[] arr, int index){
//        Base condition
        if (index == arr.length){
            return 0;
        }
        return arr[index] + sumOfArray(arr, index+1);
    }
}


// Iterative Approach
//        if (arr.length == 0){
//            return;
//        }
//        for (int i = 0; i <arr.length; i++){
//            arr[i] += i;
//            System.out.println(arr[i]);
//        }



