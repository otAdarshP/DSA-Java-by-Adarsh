package Recursion;

public class ProdOneToN {
    public static void main (String [] args){
        int num = 5;
        int answer = num * prodOneToN(num - 1);
        System.out.println(answer);
    }
    static int prodOneToN (int num){
        if (num == 1){
            return num;
        }

        prodOneToN(num-1);
        return num * prodOneToN (num -1);
    }
}
