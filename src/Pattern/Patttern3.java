package Pattern;

public class Patttern3 {
    public static void main (String[] args){
        int num = 5;
        reverseStar(num);
    }

    public static void reverseStar (int num){
        for (int row = 1; row <= num; row++){ // takes care of the number of times the equation should run.
            for (int col = num; col >= row; col--){ // this is for the pattern's requirement.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
