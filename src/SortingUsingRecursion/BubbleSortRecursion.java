package SortingUsingRecursion;

public class BubbleSortRecursion {
    public static void main (String [] args){
        int [] arr = {2,1,4,3,5};
        int answer = bubbleRecursion(arr, arr.length-1,0);
        System.out.println (answer);
    }

    public static int bubbleRecursion(int[] arr, int maxIterations, int startElement){
        // base case:
        if (arr.length == 0){
            return 0;
        }

        if (maxIterations == 0){
            return maxIterations;
        }

        if (startElement > startElement+1){
            int temp = arr[startElement];
            arr[startElement] = arr[startElement+1];
            arr[startElement+1] = temp;
        }
        return bubbleRecursion(arr, maxIterations-1, startElement+1);
    }
}
