package Strings;

import java.util.Arrays;

public class StringMethod {
    public static void main (String[] args){
        String name = "Adarsh";
        System.out.println (Arrays.toString(name.toCharArray())); // to print the characters in a string
        System.out.println(Arrays.toString(name.toUpperCase().toCharArray())); // characters in capslock
        System.out.println(name.indexOf('a')); // finds the index of the character

    }
}
