package bootcamp.practice;

//You are playing an online game. In the game, a number is displayed on the screen. In order to win the game,
//you have to count the trailing zeros in the factorial value of the given number. Write an algorithm to count
//the trailing zeros in the factorial value of the given number.
//
//Input
//The input consists of an integer num, representing the number displayed on the screen
//
//        Output
//Print an integer representing the count of trailing zeros in the factorial of the given number
//
//Note
//The factorial of the number is calculated as the product of integer numbers from 1 to num
//
//Example
//        Input
//5
//
//Output
//1
//
//Explanation
//On calculating the factorial of 5, the output is 120(1*2*3*4*5). There is only one trailing 0 in 120, so the output is 1
//
//Constraints
//1 <= num <= 10^6


import java.util.Scanner;

public class TrailingZerosInFactorial {

    public static int countTrailingZeros(int num) {
        int count = 0;

        // Count the number of factors of 5 in the numbers from 1 to num
        while (num >= 5) {
            num /= 5;
            count += num;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Get and print the number of trailing zeros in factorial
        int result = countTrailingZeros(num);
        System.out.println(result);

        sc.close();
    }
}

