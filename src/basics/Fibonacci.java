package basics;
import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        int previous = 0;
        int current = 1;
        int index = 2; // starts at 0, code runs from 2nd index value onwards

        while (index <= n){
            int temp = previous;
            previous = current;
            current = temp + previous;
            System.out.print(current + " ->");
            index++;
        }
    }
}
