public class ReverseNto1 {
    public static void main (String[] args){
        int n = 100;
        reversePrint (n);
    }

    public static int reversePrint (int n){
         if (n <= 1){
             return n;
         }
         else{
             System.out.println (n);
             return reversePrint(n-1);
         }
    }
}
