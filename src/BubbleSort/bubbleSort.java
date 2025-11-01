package BubbleSort;

public class bubbleSort {
    public static void main (String [] args){
        int [] numbers = {5,4,3,2,1};
        sortArray(numbers);
        for (int num : numbers){
            System.out.print(num + " ");
        }
    }

    public static void sortArray (int [] array){
        bubbleRecursive(array, array.length - 1, 0);
    }

    public static void bubbleRecursive (int [] array, int unsortedLength, int currentIndex){
        // base case;
        if (unsortedLength == 0){
            return;
        }

        if (unsortedLength  > currentIndex) {
            // for the element at index 0 and 1 in  the current pass of unsorted array
            if (array[currentIndex] > array[currentIndex + 1]) {
                int temp = array[currentIndex + 1];
                array[currentIndex + 1] = array[currentIndex];
                array[currentIndex] = temp;
            }
            // repeat the same process for the remaining elements in the same pass, for index 2,3, etc.
            bubbleRecursive(array, unsortedLength, currentIndex+1);
        }else{
            bubbleRecursive(array, unsortedLength - 1, 0);
        }
    }
}


