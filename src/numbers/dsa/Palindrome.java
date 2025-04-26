package numbers.dsa;

public class Palindrome {
    public static void main (String [] args){
        String palindrome = "abcdcba";
        System.out.println(isPalindrome(palindrome));

    }
    public static boolean isPalindrome (String palindrome){
        palindrome = palindrome.toLowerCase();
        int length = palindrome.length();

        for (int i = 0; i < length / 2; i++){
            if (palindrome.charAt(i) != palindrome.charAt(length - 1 - i)){
                return false;
            }
        }
        return true;
    }
}
