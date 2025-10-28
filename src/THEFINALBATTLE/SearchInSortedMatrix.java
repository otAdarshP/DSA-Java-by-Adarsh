package THEFINALBATTLE;

import java.util.Arrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,  2,  3,  4},
                {5,  6,  7,  8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 10;
        int[] answer = search (matrix, target);
        System.out.println(Arrays.toString(answer));
    }

    public static int [] search (int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[]{-1, -1};
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        while (row < rows) { // 0-indexed
            if (target >= matrix[row][0] && target <= matrix[row][cols - 1]) {
                break;
            }
            row++;
        }
        if (row == rows) {
            return new int[]{-1, -1};
        }

        // search for that element

        int low = 0;
        int high = cols - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                low = mid + 1;
            }
            if (matrix[row][mid] > target) {
                high = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

}
