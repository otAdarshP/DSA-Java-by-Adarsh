package basics;

import java.util.*;

public class SwapString {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        String str_1 = input.nextLine();
        String str_2 = input.nextLine();

        str_1 = str_1 + str_2;
        str_2 = str_1.substring(0, str_1.length() - str_2.length());
        str_1 = str_1.substring(str_2.length());

        System.out.println("This is the new str_1: " + str_1);
        System.out.println("This is the new str_2: " + str_2);
    }
}
