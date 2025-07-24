package RecursionPermutation;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {
    public static void main (String[] args){
        phoneNum("", "123");
    }

    public static void phoneNum (String processed, String unProcessed){
        if (unProcessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit = unProcessed.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            phoneNum(processed+ch, unProcessed.substring(1));
        }
    }
}
