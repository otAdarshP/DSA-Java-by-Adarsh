package RecursionSubsetSubsequencesStrings;

public class StringbasicUsingStringBuilder {
    public static void main (String[] args){
        //newString(new StringBuilder(), "bscbbacabcbadaa");
        newString(new StringBuilder(), "abababsb");
        }
    public static void newString (StringBuilder processed, String unProcessed){
        // base case:
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            newString(processed, unProcessed.substring(1));
        }
        else{
            //StringBuilder newProcessed = new StringBuilder(processed);
            //newProcessed.append(ch);
            //newString(newProcessed, unProcessed.substring(1));

            processed.append(ch);
            newString (processed, unProcessed.substring(1));
        }
    }
}
