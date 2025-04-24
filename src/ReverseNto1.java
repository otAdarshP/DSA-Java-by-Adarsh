public class ReverseNto1 {
    public static void main (String[] args){
        int n = 100;
        reversePrint (n);
    }

    public static void reversePrint (int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        reversePrint(n - 1);
        System.out.println(n);
    }
}
