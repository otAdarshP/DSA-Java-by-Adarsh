package basics;

import java.util.Scanner;

public class FactorOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 100; i++) {
            if ( i <= n){
                if (n % i == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
