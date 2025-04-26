package bootcamp.practice;

//Write a 'C' program to check if a number is Keith Number
//
//Example :
//        75
//        7,5
//        7+5=12
//        5+12=17
//        12+17=29
//        17+29=46
//        29+46=75
//
//        197
//        1+9+7=17
//        9+7+17=33
//        7+17+33=57
//        17+33+57=107
//        33+57+107=197
//
//        34285, 34348, 55604, 62662, 86935, 93993
//        1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909
//Input : 'n'
//Output : Yes / No
//1 <= 'n' <= 10000000


import java.util.*;

public class KeithNumber {

    // Function to check if a number is a Keith number
    public static boolean isKeithNumber(int n) {
        // Convert number to a string to get the digits
        String numStr = Integer.toString(n);
        int length = numStr.length();

        // Create a list to hold the digits
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            digits.add(Character.getNumericValue(numStr.charAt(i)));
        }

        // Generate the Keith sequence
        while (true) {
            int sum = 0;
            // Calculate sum of the last 'length' terms
            for (int i = 0; i < length; i++) {
                sum += digits.get(i);
            }

            // If the sum equals the original number, it's a Keith number
            if (sum == n) {
                return true;
            }

            // If the sum exceeds the number, it's not a Keith number
            if (sum > n) {
                return false;
            }

            // Move the sequence forward by adding the sum and removing the first term
            digits.add(sum); // Add the new sum to the end
            digits.remove(0); // Remove the first term
        }
    }

    public static void main(String[] args) {
        // Test Keith numbers
        int[] testNumbers = {75, 197, 34285, 34348, 55604, 62662, 86935, 93993, 1104, 1537, 2208, 2580, 3684, 4788, 7385, 7647, 7909};

        for (int num : testNumbers) {
            if (isKeithNumber(num)) {
                System.out.println(num + " is a Keith number.");
            } else {
                System.out.println(num + " is NOT a Keith number.");
            }
        }

        // Example Input:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check and print result
        if (isKeithNumber(n)) {
            System.out.println(n + " is a Keith number.");
        } else {
            System.out.println(n + " is NOT a Keith number.");
        }
        sc.close();
    }
}

