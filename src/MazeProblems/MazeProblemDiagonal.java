package MazeProblems;
import java.util.*;
public class MazeProblemDiagonal {
    public static void main (String [] args){
        System.out.println (returnMazePath("", 3,3));
    }

    //WHY IS IT MANDATORY TO USE ROW > 1 && COL > 1 WHY CAN'T WE USE THE OR (||) OPTION.

    public static ArrayList<String> returnMazePath (String processed, int rows, int cols) {
        if (rows == 1 && cols == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add (processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (rows > 1){
            list.addAll(returnMazePath (processed + 'V', rows - 1, cols));
        }

        if (cols > 1){
            list.addAll (returnMazePath(processed+'H', rows, cols - 1));
        }

        if (rows > 1 && cols > 1){
            list.addAll (returnMazePath (processed + 'D', rows - 1, cols - 1));
        }
        return list;
    }
}
