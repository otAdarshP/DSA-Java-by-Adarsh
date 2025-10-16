package Pattern;

public class Pattern4 {
    public static void main (String[] args){
        design4(5);
    }

    public static void design4 (int num){
        for (int row = 1; row <= num; row++){
            for (int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
