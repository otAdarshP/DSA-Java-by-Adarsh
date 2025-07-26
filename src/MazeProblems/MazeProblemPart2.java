package MazeProblems;

public class MazeProblemPart2 {
    public static void main (String[] args){
        namePath ("", 3, 3);
    }
    public static void namePath (String processed, int rows, int cols){
        if (rows == 1 && cols == 1){
            System.out.println(processed);
            return;
        }
        if (rows > 1){
            namePath(processed + 'D', rows - 1, cols);
        }

        if (cols > 1){
            namePath(processed+'R', rows, cols - 1);
        }
    }
}
