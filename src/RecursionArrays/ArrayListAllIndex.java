package RecursionArrays;

import java.util.ArrayList;

public class ArrayListAllIndex {
    public static void main (String [] args){
        int [] arr = {1,2,3,4,4,5};
        int target =  4;
        System.out.println (AllIndexValues(arr, 0, target));

    }

    public static ArrayList<Integer> AllIndexValues (int [] arr, int index, int target){
        ArrayList<Integer> arrayList = new ArrayList<>();

        // base condition
        if (index == arr.length){
            return arrayList;
        }

        if (arr[index] == target){
            arrayList.add(index);
        }


        ArrayList <Integer> addFromTheEnd = AllIndexValues(arr, index+1, target);
        arrayList.addAll(addFromTheEnd);


        return arrayList;
    }
}
