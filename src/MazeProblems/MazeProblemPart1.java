package MazeProblems;

public class MazeProblemPart1 {
    public static void main (String [] args){
        int pathsPossible = countPaths(3,3);
        System.out.println(pathsPossible);
    }
    public static int countPaths (int rows, int cols){ // rows = moving down and cols = moving right
        if (rows == 1 || cols == 1){
            return 1;
        }

        int movingDown = countPaths(rows -1, cols);
        int movingRight = countPaths(rows, cols -1);
        return movingDown + movingRight;
    }
}
