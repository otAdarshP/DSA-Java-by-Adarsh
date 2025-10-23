package basics;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.print("Factorial is: " + helper(num));
    }

    public static int helper (int num){
        if (num == 1){
            return num;
        }
        return num * helper (num - 1);
    }
}
