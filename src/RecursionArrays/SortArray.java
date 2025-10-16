package RecursionArrays;

public class SortArray {
    public static void main(String[] args) {
        int[] num = {3,4,2,1,5,6};
        sortArray(num, 0);

    }
    public static void sortArray(int[] num, int index){
        if (index == num.length){ // base case
            return;
        }

        for (index = 0; index < num.length; index++){
            if (num[index] > num[index+1]){
                int temp = num[index];
                num[index] = num[index+1];
                num[index+1] = temp;
            }
        }
    }
}
