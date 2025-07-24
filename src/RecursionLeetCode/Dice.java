package RecursionLeetCode;

public class Dice {
    public static void main (String [] args){
        sumOfDice("", 1);
    }

    public static void sumOfDice (String p, int target){
        if (target == 0){
            System.out.println (p);
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++){
            sumOfDice(p+i, target-i);
        }
    }
}
