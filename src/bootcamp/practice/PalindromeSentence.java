package bootcamp.practice;

public class PalindromeSentence {
    public static boolean isPalindromicSentence(String sentence) {
        // Clean the sentence: keep only letters, make lowercase
        String cleaned = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] sentences = {
                "Never odd or even.",
                "Live not on evil.",
                "Race fast, safe car!",
                "Sit on a potato pan, Otis.",
                "Cigar? Toss it in a can. It is so tragic.",
                "Go hang a salami, I’m a lasagna hog.",
                "Taco cat.",
                "Madam in Eden, I’m Adam.",
                "Go deliver a dare vile dog.",
                "Yo! Banana boy.",
                "Murder for a jar of red rum.",
                "Evil, olive!",
                "Oozy rat in a sanitary zoo.",
                "Step on no pets.",
                "Was it a cat I saw?",
                "I'm a lasagna, hang a salami.",
                "Kodak ad, OK.",
                "Naomi, Gianna, Ed, Nall, Robert, Allen, Red, Hon, Evan, Eden, Mel, Lola, Alol, Lemned, Enave, Noh, Der, Nella, Trebor, Llan, De, Anna, Ig & I moan.",
                "On a clover, if alive, erupts a vast pure evil; a fire volcano.",
                "Yawn a more Roman way.",
                "Top step's pup's pet spot.",
                "Sums are not set as a test on Erasmus.",
                "Stressed desserts.",
                "Rats drown in WordStar.",
                "No lemon, no melon.",
                "May a moody baby doom a yam?",
                "Never odd or even.",
                "Do geese see God?",
                "Sir, I demand, I am a maid named Iris.",
                "Eva, can I see bees in a cave?",
                "Egad! An adage!",
                "Gert, I saw Ron avoid a radio-van, or was it Reg?",
                "I made border bard’s drowsy swords; drab, red robed am I.",
                "Name no side in Eden, I’m mad! A maid I am, Adam mine; denied is one man.",
                "No, it can, as it is, it is a war. Raw as it is, it is an action.",
                "\"Regal as tide\", Kramer remarked. \"It's a lager!\"",
                "Was it Eliot's toilet I saw?",
                "Some men interpret nine memos."
        };

        for (String sentence : sentences) {
            if (isPalindromicSentence(sentence)) {
                System.out.println("✔ Palindrome: " + sentence);
            } else {
                System.out.println("✘ Not a Palindrome: " + sentence);
            }
        }
    }
}
