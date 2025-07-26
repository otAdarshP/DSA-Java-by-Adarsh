package MazeProblems;

import java.util.ArrayList;

public class MazeProblemPart5 {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        System.out.println (allPathMaze("", maze, 0, 0));
// this is the reason for the involvement of backtracking. Stack Overflow
    }

    public static ArrayList<String> allPathMaze(String processed, boolean[][] maze, int row, int col) {
        if (row > maze.length - 1 && col > maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList <String> list = new ArrayList <> ();

        if (row < maze.length - 1){
            list.addAll (allPathMaze(processed + 'D', maze, row + 1, col));
        }
        if (col < maze[0].length - 1){
            list.addAll (allPathMaze(processed + 'R',  maze, row, col + 1));
        }
        if (row > 0){
            list.addAll (allPathMaze(processed + 'U', maze, row-1, col));
        }
        if (col > 0){
            list.addAll (allPathMaze(processed + 'L', maze, row, col - 1));
        }
        return list;
    }
}

