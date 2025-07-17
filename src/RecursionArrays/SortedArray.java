package RecursionArrays;

public class SortedArray{
    public static void main (String[] args){
        int [] num = {1,2,3,6};
        System.out.println(sortArray(num, 0));
    }

    public static boolean sortArray(int[] num, int index){
//         base case:
        if (index == num.length - 1){
            return true;
        }
        if (num[index] > num[index + 1]){
            return false;
        }

        return sortArray(num, index+1);

    }
}