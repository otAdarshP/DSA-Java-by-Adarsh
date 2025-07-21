package RecursionSubsetSubsequencesStrings;

public class SubSeq {
    public static void main (String [] args){
        subSeqc (" ", "abc");
    }

    public static void subSeqc (String processed, String unProcessed){
        // base condition:
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        // convert string to characters
        char ch = unProcessed.charAt(0);

        // Subset SubSequencing: Either take it or Ignore it.

        // taking the element
        subSeqc (processed + ch, unProcessed.substring(1));
        // Ignoring the element
        subSeqc(processed, unProcessed.substring(1));
    }
}
