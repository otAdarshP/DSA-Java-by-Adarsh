package Pattern;

public class Patttern3 {
    public static void main (String[] args){
        design3(7);
    }


    public static void design3 (int pattern3){
        for (int row = 0; row <= pattern3; row++){
            for (int col = 0; col <= pattern3-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
