package basics;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("enter a number: ");
        int newNum = sc.nextInt();
        sum += newNum;
        while (newNum != 0){
            System.out.print("Do you want to add (1) or return the sum (0)? ");
            newNum = sc.nextInt();
            if (newNum == 1){
                System.out.print("enter the number: ");
                newNum = sc.nextInt();
                sum += newNum;
            }
            if (newNum == 0){
                System.out.print("sum is: " + sum);
            }
        }
    }
}
