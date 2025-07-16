package Recursion;

public class PassNumber {
    public static void main (String[] args){
        passNum(5);
    }

    static void passNum (int num){
        if (num == 0){
            return;
        }
        passNum(--num);
        System.out.println(num);

    }
}
