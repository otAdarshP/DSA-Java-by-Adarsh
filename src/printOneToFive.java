public class printOneToFive {
    public static void main (String[] args){
        int n = 1;
        printDigits (n);
    }

    private static void printDigits(int n) {

        if (n > 5) {
            return;
        }
        System.out.println(n);
        printDigits(n + 1);

    }
}
