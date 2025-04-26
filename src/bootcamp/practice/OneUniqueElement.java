package bootcamp.practice;

public class OneUniqueElement {
    public static void main (String [] args){

        int [] arr = new int[]{12, 19, 23, 77, 51, 15, 21, 12, 51, 23, 19, 77, 21};
        int target = 15;
        System.out.println(findUnique(arr));

    }

    public static int findUnique(int [] arr){
        int uniqueEle = 0;
        for (int num : arr){
            uniqueEle ^= num;
        }
        return uniqueEle;
    }
}
