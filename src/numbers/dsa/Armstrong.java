package numbers.dsa;

public class Armstrong {
    public static void main (String [] args){
        int n = 153;

        System.out.println(isArmstrong(n));
    }

    public static boolean isArmstrong (int n){
        int original = n;
        int temp = n;
        int digit = 0;
        int sum = 0;

        while (temp > 0){
            temp = temp / 10;
            digit++;
        }

        temp = n;
        while (temp > 0){
            int rem = temp % 10;
            sum = (int) (sum + Math.pow (rem, digit));
            temp = temp / 10;
        }
        return sum == original;
    }
}
