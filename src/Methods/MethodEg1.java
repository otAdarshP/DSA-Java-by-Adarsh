package Methods;

import java.util.Scanner;

public class MethodEg1 {
    public static void main (String[] args){
        sum2();
        sum2();
    }
// this is by using "void" return_type
    static void sum2 (){
        Scanner in = new Scanner(System.in);
        System.out.println("Num 1 is: ");
        int num1 = in.nextInt();
        System.out.println ("Num 2 is: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The total sum is: " + sum);
    }
}
