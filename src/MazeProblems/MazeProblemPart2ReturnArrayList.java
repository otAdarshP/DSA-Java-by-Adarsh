package MazeProblems;
import java.util.ArrayList;

public class MazeProblemPart2ReturnArrayList {
    public static void main (String[] args){
        System.out.println (returnPathName ("", 3, 3));

    }
    public static ArrayList<String> returnPathName (String processed, int rows, int cols){
        if (rows ==1 && cols ==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (rows > 1){
            list.addAll(returnPathName (processed + 'D', rows - 1, cols));
        }
        if (cols > 1){
            list.addAll(returnPathName (processed + 'R',  rows, cols - 1));
        }
        return list;
    }
}
