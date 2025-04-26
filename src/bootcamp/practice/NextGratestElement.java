package bootcamp.practice;

public class NextGratestElement {
    public static void main (String [] args){
        int [] arr = {16, 17, 3, 4, 5, 2};
        greatestFromRight(arr);
        for (int num : arr) {
            System.out.println(num);
        }
    }

    public static int greatestFromRight(int [] arr){
        int rightMostElement = -1;

        for (int i = arr.length - 1; i > 0; i--){
            int current = arr[i];
            arr[i] = rightMostElement;
            if (current > rightMostElement){
                rightMostElement = current;
            }
        }
        return 0;
    }
}
