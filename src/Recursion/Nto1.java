package Recursion;

public class Nto1 {
    public static void main (String[] args){
        int ans = numsTo1(5);
        System.out.println(ans);
    }
    public static int numsTo1(int num){
        if (num == 1){
            return num;
        }

        System.out.println(num);
        return numsTo1(num - 1);
    }
}
