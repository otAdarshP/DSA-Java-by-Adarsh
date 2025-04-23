import java.util.ArrayList;
import java.util.Arrays;

public class Matrix2DSorted {
    public static void main (String[] args){
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add (new ArrayList<>(Arrays.asList (0, 1, 1)));
        matrix.add (new ArrayList<>(Arrays.asList(0, 1, 1)));

        int n = 3;
        int m = 3;

        System.out.println(RowOfMax1s(matrix, n, m));
    }

    static int lowerBound (ArrayList<Integer> matrix, int n, int x){
        int start = 0;
        int end = n - 1;
        int answer = n;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (matrix.get(mid) >= x){
                answer = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return answer;
    }
    static int RowOfMax1s(ArrayList<ArrayList<Integer>> matrix, int n, int m){
        int maxCount = 0;
        int index = -1;

        for (int i = 0; i < n; i++){
            int presentCount = m - lowerBound (matrix.get(i), m, 1);
            if (presentCount > maxCount){
                maxCount = presentCount;
                index = i;
            }
        }
        return index;
    }
}

