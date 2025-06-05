package Pattern;

public class Pattern1 {
    public static void main (String[] args){
        design1 (4);
    }

    static void design1 (int pattern1){
        for (int row = 0; row <= pattern1; row++){
            for (int col = 0; col <= row; col++){
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
