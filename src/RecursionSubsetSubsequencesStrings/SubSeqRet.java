package RecursionSubsetSubsequencesStrings;

import java.util.ArrayList;

public class SubSeqRet {
    public static void main (String[] args){
        System.out.println(subSeqReturn("", "abc"));
    }

    public static ArrayList<String> subSeqReturn (String processed, String unProcessed){
        // base case:
        if (unProcessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        char ch = unProcessed.charAt(0);

        // building sub se return from both the left and right halves of the argument
        ArrayList<String> right = subSeqReturn(processed + ch, unProcessed.substring(1));
        ArrayList<String> left = subSeqReturn(processed, unProcessed.substring(1));

        right.addAll(left);
        return right;
    }
}
