package MazeProblems;

public class MazeProblemPart6 {
    public static void main (String[] args){
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        returnBacktrackPath("", 0,0, maze);
    }

    public static void returnBacktrackPath (String processed, int rows, int cols, boolean [][] maze){
        if (rows == maze.length - 1 && cols == maze[0].length - 1){
            System.out.println (processed);
            return;
        }

        if (!maze[rows][cols]){
            return;
        }
        maze[rows][cols] = false;

        if (rows < maze.length - 1){
            returnBacktrackPath(processed + 'D', rows + 1, cols, maze);
        }

        if (cols < maze[0].length - 1){
            returnBacktrackPath(processed + 'R', rows, cols + 1, maze);
        }

        if (rows > 0){
            returnBacktrackPath(processed + 'U', rows - 1, cols, maze);
        }

        if (cols > 0){
            returnBacktrackPath(processed + 'L', rows, cols - 1, maze);
        }

        maze[rows][cols] = true;
    }
}
