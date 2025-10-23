package basics;

import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the meters used: ");
        int meter = input.nextInt();
        int AmountPayable = payBill(meter);
        System.out.print("Total amount payable is: " + AmountPayable);
    }

    public static int payBill (int meter){
        int amount = 0;

        if (meter < 100){
            amount = meter * 5;
        }
        else if (meter < 200){
            amount = 100 * 5 + (meter - 100) * 7;
        }
        else if (meter < 500){
            amount = 100 * 5 + 100 * 7 + (meter - (200)) * 10;
        }
        else if (meter < 1000){
            amount = 100 * 5 + 100 * 7 + 300 * 10 + (meter - (500)) * 20;
        }
        return amount;
    }
}
