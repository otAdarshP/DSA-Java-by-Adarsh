package Recursion;

import java.util.*;


public class SumOfElementsOfArray {
    public static void main (String[] args){
        int [] arr = {1,2,3,4,6};

//        base case:
        if (arr.length == 0){
            return;
        }
        for (int i = 0; i <arr.length; i++){
            arr[i] += i;
            System.out.println(arr[i]);
        }
    }
}
