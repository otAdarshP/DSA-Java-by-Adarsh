package bootcamp.practice;

import java.util.Arrays;

public class LargestValue {
    public static void main (String[] args){
        String [] str = {"51", "546", "548", "60"};
        Arrays.sort(str, (a,b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();
        for (String s : str){
            result.append(s).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
