package Recursion;

public class PrintNos {
    public static void main(String[] args){
        printNumbers(1, 5);
    }
    static void printNumbers(int Lrange, int Urange){
        if (Lrange > Urange){
            return;
        }
        System.out.println(Lrange);
        printNumbers(Lrange+1, 5);
    }
}
