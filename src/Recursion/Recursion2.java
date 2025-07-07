package Recursion;

public class Recursion2 {
    public static void main (String[] args){
        print (1);
    }

    static void print (int n){
// always have checks for defining the conditions - BASE CONDITION
        if (n > 5){
            return;
        }

//        if only this is executed, it would run for indefinite time and produce an error. // WITHOUT BASE CONDITION
//         STACK WOULD CONTINUE TO FILL AND EVERY CALL TAKES MEMORY
        System.out.println(n);
//        this step below is tail recursion
        print (n+1);
    }
}
