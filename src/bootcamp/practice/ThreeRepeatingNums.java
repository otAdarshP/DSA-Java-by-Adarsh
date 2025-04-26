public class ThreeRepeatingNums {
    public static int findUnique(int[] arr) {
        int result = 0;

        // Iterate over each bit (32-bit integers)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int mask = 1 << i;

            for (int num : arr) {
                if ((num & mask) != 0) {
                    sum++;
                }
            }

            // If sum % 3 != 0, then that bit belongs to the unique number
            if (sum % 3 != 0) {
                result |= mask;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 4, 5, 3, 6, 4, 4, 6, 3};
        System.out.println(findUnique(arr));  // Output: 5
    }
}

