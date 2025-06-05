package Pattern;

public class Patttern3 {
    public static void main (String[] args){
        design3(4);
    }


    public static void design3 (int pattern3){
        for (int col = 0; col <= pattern3; col++){
            for (int row = 0; row <= col; row++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
