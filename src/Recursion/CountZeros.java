package Recursion;

public class CountZeros {
    public static void main (String[] args) {
        String num = "1000009000";
        int [] freq = new int [10];

        zeroCount(num, 0, freq);
        for (int i = 0; i < 10; i++){
            System.out.println(i + "=> " + freq[i]);
        }

    }
    public static String zeroCount (String strNum, int index, int [] freq){
        if (index == strNum.length()){
            return strNum;
        }

//        char [] charArray = strNum.toCharArray();
//        char charStrNum = charArray[index];
//        or in place of the above just use below, which is more time and memory space efficient
        char charStrNum = strNum.charAt(index);
        int digit = charStrNum - '0';
        freq[digit]++;
        return zeroCount(strNum, index+1, freq);
    }
}
