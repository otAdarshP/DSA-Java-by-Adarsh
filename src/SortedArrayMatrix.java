import java.util.Arrays;

public class SortedArrayMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 6;
        int[] result = searchInMatrix(matrix, target);
        System.out.println(Arrays.toString(result));
    }

    // Binary Search in a single row
    public static int[] binarySearchInRow(int[][] matrix, int rowIndex, int startCol, int endCol, int target) {
        while (startCol <= endCol) {
            int midCol = startCol + (endCol - startCol) / 2;

            if (matrix[rowIndex][midCol] == target) {
                return new int[]{rowIndex, midCol};
            }

            if (matrix[rowIndex][midCol] < target) {
                startCol = midCol + 1;
            } else {
                endCol = midCol - 1;
            }
        }

        return new int[]{-1, -1}; // Not found
    }

    // Main search logic in a sorted 2D matrix
    public static int[] searchInMatrix(int[][] matrix, int target) {
        int totalRows = matrix.length;
        int totalCols = matrix[0].length;

        // Special case: only one row
        if (totalRows == 1) {
            return binarySearchInRow(matrix, 0, 0, totalCols - 1, target);
        }

        int startRow = 0;
        int endRow = totalRows - 1;
        int middleCol = totalCols / 2;

        // Narrowing down to 2 rows
        while (startRow < endRow - 1) {
            int midRow = startRow + (endRow - startRow) / 2;

            if (matrix[midRow][middleCol] == target) {
                return new int[]{midRow, middleCol};
            }

            if (matrix[midRow][middleCol] < target) {
                startRow = midRow;
            } else {
                endRow = midRow;
            }
        }

        // Now only 2 rows: startRow and startRow + 1
        // Check middle column of both rows
        if (matrix[startRow][middleCol] == target) {
            return new int[]{startRow, middleCol};
        }

        if (matrix[startRow + 1][middleCol] == target) {
            return new int[]{startRow + 1, middleCol};
        }

        // 4 possibilities: search in 4 quadrants
        // Top-left part
        if (target <= matrix[startRow][middleCol - 1]) {
            return binarySearchInRow(matrix, startRow, 0, middleCol - 1, target);
        }

        // Top-right part
        if (target >= matrix[startRow][middleCol + 1] && target <= matrix[startRow][totalCols - 1]) {
            return binarySearchInRow(matrix, startRow, middleCol + 1, totalCols - 1, target);
        }

        // Bottom-left part
        if (target <= matrix[startRow + 1][middleCol - 1]) {
            return binarySearchInRow(matrix, startRow + 1, 0, middleCol - 1, target);
        }

        // Bottom-right part
        else {
            return binarySearchInRow(matrix, startRow + 1, middleCol + 1, totalCols - 1, target);
        }
    }
}
