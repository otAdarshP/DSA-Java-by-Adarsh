package Recursion;

public class ReverseString {
    public static void main (String[] args) {
        String str = "Hello";
        String reversed = reverseString(str, 0);
        System.out.println(reversed);
    }

    public static String reverseString (String str, int index){
//        base condition:
        if (str.length() <= 1){
            return str;
        }
        if (index == str.length()){
            return "";
        }

//        recursive call:
        return reverseString(str, index + 1) + (str.charAt(index));
    }
}
