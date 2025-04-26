package bootcamp.practice;

import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(sentence));  // Output: true
    }
    public static boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase();
        Set<Character> letters = new HashSet<>();

        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters.add(ch);
            }
        }
        System.out.println(letters);
        return letters.size() == 26;
    }


}
