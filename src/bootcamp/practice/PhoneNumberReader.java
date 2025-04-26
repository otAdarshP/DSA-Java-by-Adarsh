package bootcamp.practice;
//
//Write a program to print the way we read a phone number
//
//Samples:
//        9442161065
//
//Nine Double Four Two One Six One Zero Six Five
//9994466665
//
//Triple Nine Double Four Double Six Double Six Five


import java.util.Scanner;

public class PhoneNumberReader {

    // Function to read the phone number in the required format
    public static String readPhoneNumber(String phoneNumber) {
        StringBuilder result = new StringBuilder();
        int n = phoneNumber.length();

        // Start iterating over the phone number
        int i = 0;
        while (i < n) {
            // Count the number of consecutive occurrences of the current digit
            int count = 1;
            while (i + 1 < n && phoneNumber.charAt(i) == phoneNumber.charAt(i + 1)) {
                count++;
                i++;
            }

            // Add the appropriate description for the digit
            if (count == 1) {
                result.append(getDigitName(phoneNumber.charAt(i))).append(" ");
            } else {
                result.append(getDigitName(phoneNumber.charAt(i))).append(" ").append(getCountName(count)).append(" ");
            }
            i++;
        }

        return result.toString().trim();
    }

    // Function to get the name of a digit
    private static String getDigitName(char digit) {
        switch (digit) {
            case '1': return "One";
            case '2': return "Two";
            case '3': return "Three";
            case '4': return "Four";
            case '5': return "Five";
            case '6': return "Six";
            case '7': return "Seven";
            case '8': return "Eight";
            case '9': return "Nine";
            case '0': return "Zero";
            default: return "";
        }
    }

    // Function to get the count term (e.g., Double, Triple, etc.)
    private static String getCountName(int count) {
        switch (count) {
            case 2: return "Double";
            case 3: return "Triple";
            case 4: return "Quadruple";
            case 5: return "Quintuple";
            case 6: return "Sextuple";
            case 7: return "Septuple";
            case 8: return "Octuple";
            case 9: return "Nonuple";
            case 10: return "Decuple";
            default: return "";
        }
    }

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Input the phone number
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        // Output the readable format
        System.out.println(readPhoneNumber(phoneNumber));

        sc.close();
    }
}
