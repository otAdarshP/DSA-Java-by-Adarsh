package bootcamp.practice;

//Tootreefibe is a country with all of their citizens well versed with Arithmetics, they have created a number system which is made of three digits 2, 3, 5 - Their system is a not a positional number system it is just a coded system.
//The table below explains their system
//
//1 2 3  4  5  6  7  8  9 10 11 12  13  14  15  16  17  18  19  20
//        2 3 5 22 23 25 32 33 35 52 53 55 222 223 225 232 232 233 252 253
//
//Input: N
//Ouput : Nth term in their number system
//
//Constraint :
//        1 <= N <= 10000

public class TootreefibeNumberSystem {

    // Function to convert the Nth number in Tootreefibe system
    public static String getNthTerm(int N) {
        // We will treat this as a base-3 number system where:
        // 0 -> 2, 1 -> 3, 2 -> 5

        // Resulting number in Tootreefibe system
        StringBuilder result = new StringBuilder();

        // Adjust N to be 0-indexed
        N -= 1;

        while (N >= 0) {
            int remainder = N % 3;

            // Map base-3 digits to 2, 3, 5
            if (remainder == 0) {
                result.insert(0, '2');
            } else if (remainder == 1) {
                result.insert(0, '3');
            } else if (remainder == 2) {
                result.insert(0, '5');
            }

            // Update N for the next iteration
            N = N / 3 - 1;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test the function with various values of N
        System.out.println(getNthTerm(1));  // Output: 2
        System.out.println(getNthTerm(2));  // Output: 3
        System.out.println(getNthTerm(3));  // Output: 5
        System.out.println(getNthTerm(4));  // Output: 22
        System.out.println(getNthTerm(5));  // Output: 23
        System.out.println(getNthTerm(10)); // Output: 52
        System.out.println(getNthTerm(100)); // Output: 533
    }
}

