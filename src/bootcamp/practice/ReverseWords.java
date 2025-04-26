package bootcamp.practice;

public class ReverseWords {

    // Function to reverse the words in a sentence
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");  // Split the sentence into words
        StringBuilder reversed = new StringBuilder();

        // Loop through the words array from the last word to the first
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);  // Append the word to the result
            if (i > 0) {
                reversed.append(" ");  // Add a space between words
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        String sentence1 = "This is a test sentence";
        String sentence2 = "one two three four five six seven eight nine ten";
        String sentence3 = "A popular puzzle dating well into ancient times the word square is sometimes compared to the numerical magic square though apart from the fact that both use square grids there is no real connection between the two";

        // Test sentences
        System.out.println(reverseWords(sentence1));
        System.out.println(reverseWords(sentence2));
        System.out.println(reverseWords(sentence3));
    }
}
