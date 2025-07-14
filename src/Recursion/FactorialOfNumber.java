package Recursion;

public class FactorialOfNumber {
    public static void main (String [] args){
        int number = 4;
        int factor = number * factoriseNumber(number-1);
        System.out.println(factor);

    }

    public static int factoriseNumber (int number){
        if (number == 0 || number == 1){ // base condition
            return 1;
        }

        return number * factoriseNumber(number-1);
    }
}
