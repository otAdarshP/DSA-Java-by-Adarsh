package BinarySearch;

public class SearchIn2D {
    public static void main (String [] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 78;
        boolean answer = searchMatrix(matrix, target);
        System.out.println(answer);
    }

    public static boolean searchMatrix (int [][] matrix, int target){

        int m;
        int n;

        m = matrix.length;
        n = matrix[0].length;

        int start = 0;
        int end = m * n - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            int midElement = matrix[mid / n] [mid % n];

            if (midElement == target){
                return true;
            }
            if (midElement > target) {
                end = mid - 1;
            }
            if (midElement < target) {
                start = mid + 1;
            }
        }
        return false;
    }
}
