package basics;
import java.util.Scanner;

public class MaxOfNums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        System.out.print("Enter the number: ");
        int newInput = input.nextInt();

        while (newInput != 0) {
            if (newInput >  max) {
                max = newInput;
            }
            System.out.print("Enter a number: ");
            newInput = input.nextInt();
        }

        if (newInput == 0){
            System.out.println(max);
        }
    }
}
