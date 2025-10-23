package basics;

import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int start = sc.nextInt();
        System.out.print("Enter the second number ");
        int second = sc.nextInt();
        System.out.print("The fibonacci series end is: " );
        int end = sc.nextInt();
        int[] fibSeries = new int[end];
        fibSeries[0] = start;
        if (end > 1){
            fibSeries[1] = second;
        }
        for (int i = 2; i < end; i++) {
            fibSeries[i] = fibSeries[i-1]+fibSeries[i-2];
        }
        for (int num : fibSeries) {
            System.out.print(num + " ");
        }
    }
}
