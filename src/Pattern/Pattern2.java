package Pattern;

public class Pattern2 {
    public static void main (String[] args){
        design2(3);
    }
// the count of rows / columns start at 0

    static void design2 (int pattern2){
        for (int row = 0; row <= pattern2; row++){
            for (int col = 0; col <= pattern2; col++){
                System.out.print("A");
            }
            System.out.println();
        }
    }
}
