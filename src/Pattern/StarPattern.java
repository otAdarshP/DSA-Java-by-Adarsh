package Pattern;
import java.util.Scanner;

public class StarPattern {
//    public static void main (String[] args){
//        int num = 4;
//        print (num);
//    }
//    public static void print (int num){
//        for (int row = num; row <= num; row--){
//            for (int col = row; col >= 0; col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }


    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();

        String ans = print (num);
        System.out.println(ans);
    }

    public static String print (int num){
        StringBuilder sb = new StringBuilder();

        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= row; col++){
                sb.append ("*");
            }
            sb.append ("\n");
        }
        return sb.toString();
    }
}
