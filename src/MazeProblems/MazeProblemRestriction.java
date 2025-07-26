package MazeProblems;
import java.util.*;
public class MazeProblemRestriction {
    public static void main (String [] args){
        boolean [][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println (mazePathRestriction("", maze, 0, 0));
    }
    public static ArrayList<String> mazePathRestriction (String processed, boolean [][] maze, int row, int col){
        if (row == maze.length - 1 && col == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();;
            list.add (processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if (maze [row][col] == false){
            return list;
        }
        if (row < maze.length - 1){
            list.addAll(mazePathRestriction (processed +'D',maze, row + 1, col));
        }

        if (col < maze[0].length - 1){
            list.addAll(mazePathRestriction(processed+'R', maze, row, col+1));
        }
        return list;
    }
}
