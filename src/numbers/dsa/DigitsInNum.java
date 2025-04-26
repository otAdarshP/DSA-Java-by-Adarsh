package numbers.dsa;

public class DigitsInNum {
    public static void main (String[] args){
        int num = 3586;

        int count = 0;
        int sum = 0;

        while (num > 0){

            int digit = num % 10;
            System.out.println(digit);

            count ++;
            sum = sum + digit;

            num = num / 10;

        }
        System.out.println(count);
        System.out.println(sum);

    }
}
