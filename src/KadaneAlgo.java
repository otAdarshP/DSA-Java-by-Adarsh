public class KadaneAlgo {
    public static void main (String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int [] arr){
        int result = arr[0];
        int maxAtEnd = arr[0];

        for (int i = 0; i < arr.length; i++){

            maxAtEnd = Math.max(maxAtEnd + arr[i], arr[i]);
            result = Math.max(result, maxAtEnd);
        }
        return result;
    }
}

