package MazeProblems;

import java.util.Arrays;

public class MazeProblemPart8 {
    public static void main (String [] args){
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int [][] paths = new int [maze.length][maze[0].length];
        printPathSteps("", 0, 0, maze, 1, paths);
    }
    public static void printPathSteps (String processed, int rows, int cols, boolean [][] maze, int steps, int [][] paths){
        // base case:
        if (rows == maze.length - 1 && cols == maze[0].length - 1){
            for (int [] arr : paths){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }

        if (!maze[rows][cols]){
            return;
        }

        maze [rows][cols] = false;
        paths [rows][cols] = steps;

        if (rows < maze.length - 1){
            printPathSteps(processed+'D', rows + 1, cols, maze, steps + 1,paths);
        }
        if (rows > 0){
            printPathSteps(processed+ 'U', rows -1, cols, maze, steps + 1, paths);
        }

        if (cols < maze[0].length - 1){
            printPathSteps(processed+ 'R', rows, cols + 1, maze, steps + 1, paths);
        }
        if (cols > 0){
            printPathSteps(processed+ 'L',rows, cols - 1, maze, steps + 1, paths);
        }

        maze[rows][cols] = true;
        paths[rows][cols] = 0; // at the time of backtracking
    }
}
