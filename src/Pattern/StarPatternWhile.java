package Pattern;

public class StarPatternWhile {
    public static void main(String[] args) {
        int num = 5;

        design5(num);
    }

    public static void design5 (int num){
        for (int row = 1; row < 2 * num; row++){
            int totalRowInCol = row <= num ? row : 2* num - row;
            for (int col = 1; col <= totalRowInCol; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
