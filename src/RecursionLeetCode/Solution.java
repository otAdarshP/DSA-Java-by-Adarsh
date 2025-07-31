package RecursionLeetCode;

public class Solution {
    public static void main (String[] args){
        double x = 2.10000;
        int n = 3;
        System.out.println(myPow (x, n));
    }

    public static double myPow(double x, int n) {
// primary set up condition to convert negatives to positives
        long N = n;
        if (N < 0){
            x = 1/x;
            N = -N;
        }
        return fastPow (x, n);
    }

    private static double fastPow(double x, int n){
        // base condition
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return x;
        }

        double half = fastPow (x, n / 2);
        if (n % 2 == 0){
            return half * half;
        }
        else {
            return x * fastPow(x, n - 1);
        }
    }
}