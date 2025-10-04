package basics;

import java.util.Scanner;

public class BasicStrings {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        char ch = input.nextLine().trim().charAt(0);
        System.out.println(ch);

        if (Character.isLowerCase(ch)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
