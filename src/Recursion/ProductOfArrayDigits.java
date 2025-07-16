package Recursion;

public class ProductOfArrayDigits {
    public static void main (String[] args){
        int [] num = {2,4};
        int index = 0;
        int ans = num[index] * productOfArray(num, index+1);
        System.out.println(ans);
    }

    static int productOfArray (int [] num, int index){
        if (index == num.length){
            return 1;
        }

        return num[index] * productOfArray(num, index + 1);
    }
}
