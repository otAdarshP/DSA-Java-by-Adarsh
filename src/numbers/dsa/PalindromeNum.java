package numbers.dsa;

public class PalindromeNum {
    public static void main (String [] args) {
        int n = 121;
        System.out.println(isPNum(n));
    }

    public static boolean isPNum(int n){
            if (n < 0 || (n % 10 == 0 && n != 0)) {
                return false;
            }

            int original = n;
            int rev = 0;
            while ( n > 0){
                int digit = n % 10;
                rev = rev * 10 + digit;
                n = n / 10;
            }
            return rev == original;
    }
}
