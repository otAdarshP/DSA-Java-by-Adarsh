package LeetCodeBacktracking;

public class SudokuSolver {
    public static void main (String [] args){
        int [][] board = new int [][] {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (Solve(board)){
            display(board);
        }
        else{
            System.out.println ("Cannot solve");
        }
    }

    public static boolean isSafe (int [][] board, int row, int col, int num){

        // check row:
        for (int i = 0; i < board.length; i++){
            if (board [row][i] == num){
                return false;
            }
        }

        // check cols:
        for (int[] nums : board){
            if (nums[col] == num){
                return false;
            }
        }

        // checking the box inside sudoku
        int sqrt = (int) (Math.sqrt (board.length));
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++){
            for (int c = colStart; c < colStart + sqrt; c++){
                if (board [r][c] == num){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean Solve (int [][] board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean leftEmpty = true; // none are empty
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (board[row][col] == 0){
                    row = i;
                    col = j;
                    leftEmpty = false;
                    break;
                }
            }
            if (!leftEmpty){
                break;
            }
        }
        if (leftEmpty){
            return true;
        }

        for (int number = 1; number <= 9; number++){
            if (isSafe (board, row, col, number)){
                board [row][col] = number;
                if (Solve(board)){
                    return true;
                }
                else{
                    board[row][col] = 0; // backtrack
                }
            }
        }
        return false;
    }

    public static void display (int [][] board){
        for (int [] rows: board){
            for (int element : rows){
                System.out.println (element + " ");
            }
            System.out.println ();
        }
    }
}
