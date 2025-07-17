public class ReverseNum {
    public static void main (String[] args){
        int num = 1234;
        int reversed = reversedNum(num, 0);
        System.out.println(reversed);
    }

    public static int reversedNum (int num, int reverse){
        if (num == 0){
            return reverse;
        }
        int rem = num % 10;
        reverse = reverse * 10 + rem;
        return reversedNum(num / 10, reverse);
    }
}
