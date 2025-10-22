package basics;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Till what do we need the fibonacci number for? ");
        int end = sc.nextInt();
        System.out.print("The fibonacci series is: " );
        int[] nums = new int[end];
        for (int interate = 0; interate < end; interate++) {
            nums[interate] = nums[interate] + nums[interate-1];
        }
    }
}
