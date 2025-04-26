package bootcamp.practice;

public class PalindromeWord {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {
                "civic", "radar", "madam", "malayalam", "nun", "mom", "pop",
                "saippuakivikauppias", "kayak", "deified", "rotator", "repaper",
                "deed", "peep", "wow", "noon", "racecar", "level"
        };

        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a Palindrome");
            } else {
                System.out.println(word + " is NOT a Palindrome");
            }
        }
    }
}

