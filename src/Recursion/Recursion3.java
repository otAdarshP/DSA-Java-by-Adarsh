package Recursion;

public class Recursion3 {
    public static void main (String[] args){
        System.out.println(fibo(4));
    }

    static int fibo(int n){
        // base condition
        if (n < 2){ // because, fibo (0) = 0; fibo(1) = 1
            return n;
        }
//        this is not a tail recursion as it takes the answer, sums it up and then processes
        return fibo (n-1) + fibo (n-2);
    }
}
