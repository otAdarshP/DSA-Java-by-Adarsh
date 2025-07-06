package Methods;

import java.util.Scanner;

public class NormalCall {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("number 1 is: ");
        int num1 = sc.nextInt();
        System.out.println("number 2 is: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;
        System.out.println("sum is:" + sum);
    }
}
