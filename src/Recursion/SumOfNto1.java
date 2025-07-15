package Recursion;

public class SumOfNto1 {
    public static void main (String [] args){
        int num = 10;
        int answer = num + sumOfNums (num - 1);
        System.out.println(answer);
    }

    static int sumOfNums(int num){
        if (num <= 1){
            return num;
        }

        return num + sumOfNums(num - 1);
    }
}
