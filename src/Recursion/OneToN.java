package Recursion;

public class OneToN {
    public static void main(String[] args){
        oneToN(5);
    }

    static void oneToN (int num){
        if (num == 0){
            return;
        }

        oneToN(num - 1);
        System.out.println(num);
    }
}
