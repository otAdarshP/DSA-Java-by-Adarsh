    import java.util.Scanner;
    import java.util.Arrays;

    public class Main {
        public static void main (String[] args) {
            Scanner in = new Scanner (System.in);

            int [] [] arr2d = new int [3] [3];

            //int [] [] arr2d = {
    //                {1, 2, 3},
    //                {4, 5},
    //                {6, 7, 8, 9}
    //        };

            System.out.println (arr2d.length);



            for (int row = 0; row < arr2d.length; row++){
                for (int col = 0; col < arr2d[row].length; col++){
                    arr2d [row] [col] = in.nextInt();
                }
            }
            for (int [] row : arr2d){
                for (int col : row){
                }
            }System.out.println (Arrays.deepToString (arr2d));
        }
    }