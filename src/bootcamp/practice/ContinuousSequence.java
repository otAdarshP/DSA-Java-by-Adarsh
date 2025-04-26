package bootcamp.practice;

//Given a string that is a set of continuous integers, your task is check it's Truthfullness.
//Output is the beginning value and the last value, else print -1
//
//Sample1:
//        989987986985984983982981980979978977976975
//
//Output
//989 975
//
//Sample2:
//        987654321
//
//Output
//9 1
//
//Sample 3:
//        10101009100810071006100510041003100210011000999998997996995994993992991990
//
//Output
//1010 990



import java.util.Scanner;

public class ContinuousSequence {

    public static String checkTruthfulness(String str) {
        // Try different lengths for the first number
        for (int len = 1; len <= str.length() / 2; len++) {
            // Take the first number of length 'len'
            long firstNum = Long.parseLong(str.substring(0, len));
            StringBuilder sequence = new StringBuilder();
            long currentNum = firstNum;

            // Build the sequence and check if it matches the string
            while (sequence.length() < str.length()) {
                sequence.append(currentNum);
                currentNum--;
            }

            // If the sequence length matches the string and it's a valid sequence
            if (sequence.toString().equals(str)) {
                // Get the last number of the sequence
                long lastNum = currentNum + 1;  // lastNum is the first number of the previous iteration
                return firstNum + " " + lastNum;
            }
        }

        return "-1"; // No valid sequence found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the continuous integers string: ");
        String input = sc.nextLine();

        // Output the result
        System.out.println(checkTruthfulness(input));

        sc.close();
    }
}

