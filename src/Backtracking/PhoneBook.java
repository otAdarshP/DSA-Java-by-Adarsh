package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    public List<String> letterCombinations(String digits) {
        List<String> results = new ArrayList<>();

        String[] map = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        if (digits == null || digits.length() == 0){
            return results;
        }

        backTrack(digits, results, new StringBuilder(), 0, map);
        return results;
    }

    private void backTrack (String digits, List<String> results, StringBuilder currentString, int index, String[] map){
// Base condition:
        if (index ==  digits.length()){
            results.add(currentString.toString()); // add is used for Strings
            return;
        }

        String possibleLetters = map[digits.charAt(index) - '0']; // at that particular index, what all are the possible values?

        for (char letter : possibleLetters.toCharArray()){
            currentString.append(letter); // append is used for StringBuilder
            backTrack(digits, results, currentString, index+1, map); // go to the element at the other index and check the combination
            currentString.deleteCharAt(currentString.length() - 1); // delete the value at the index 2, and add the other available value for it.
        }
    }
}
