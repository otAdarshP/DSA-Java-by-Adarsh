package Heaps;

// Java program to sort a nearly sorted array
import java.util.*;

class SortNearlySorted {
    // Function to sort a nearly sorted array
    // where every element is at most
    // k positions away from its target position.
    static void nearlySorted(int[] arr, int k) {
        // Arrays.sort(arr); // O(n log n)

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(); // O (n log k)

        for (int i = 0; i  < k; i++){
            maxHeap.add(arr[i]);
        }

        int i;
        for (i = k; i  < arr.length; i++){
            maxHeap.add(arr[i]);

            arr[i-k] = maxHeap.poll();
        }

        while(!maxHeap.isEmpty()){
            arr[i-k] = maxHeap.poll();
            i++;
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = {6, 5, 3, 2, 8, 10, 9};

        nearlySorted(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}