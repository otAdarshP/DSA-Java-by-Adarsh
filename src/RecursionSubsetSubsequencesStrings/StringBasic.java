package RecursionSubsetSubsequencesStrings;

public class StringBasic {
    public static void main (String[] args){
        StringBuild(" ", "baccad");
    }
    public static void StringBuild (String processed, String unProcessed){
//        base condition
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unProcessed.charAt(0);

        if (ch == 'a'){
            StringBuild (processed, unProcessed.substring(1));
        }
        else{
            StringBuild(processed + ch, unProcessed.substring(1));
        }
    }
}
