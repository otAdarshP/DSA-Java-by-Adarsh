package numbers.dsa;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        System.out.println(findGCD(a, b));
        System.out.println(findLCM(a, b));
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int findLCM(int a, int b){
        return (a*b) / findGCD(a, b);
    }
}
