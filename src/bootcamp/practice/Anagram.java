package bootcamp.practice;

import java.util.Arrays;

public class Anagram {

    // Function to clean the string (remove spaces, punctuation, and convert to lowercase)
    public static String cleanString(String str) {
        return str.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        String s1 = cleanString(str1);
        String s2 = cleanString(str2);

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String[][] pairs = {
                {"a decimal point", "I’m a dot in place"},
                {"monasteries", "Amen stories"},
                {"a near miss", "an ear miss"},
                {"old England", "golden land"},
                {"an aisle", "is a lane"},
                {"restaurant", "runs a treat"},
                {"considerate", "care is noted"},
                {"saintliness", "least in sins"},
                {"conversation", "voices rant on"},
                {"Semolina", "is no meal"},
                {"dormitory", "dirty room"},
                {"signature", "a true sign"},
                {"dynamite", "may it end"},
                {"Statue of Liberty", "built to stay free"},
                {"eleven plus two", "twelve plus one"},
                {"the earthquakes", "that queer shake"},
                {"Fourth of July", "joyful fourth"},
                {"the Morse Code", "here come dots"},
                {"gold and silver", "grand old evils"},
                {"a gentleman", "elegant man"},
                {"astronomer", "moon starer"}
        };

        for (String[] pair : pairs) {
            System.out.printf("\"%s\" <=> \"%s\" => %s%n", pair[0], pair[1], isAnagram(pair[0], pair[1]));
        }
    }
}
