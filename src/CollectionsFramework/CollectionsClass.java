package CollectionsFramework;
import java.util.*;

public class CollectionsClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 4); // works only in sorted array
       // Collections.max(arr);
       // Collections.sort(arr); // won't work

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Collections.sort (list); // works

        // Collections.sort() or .max() or any other,
        // they only works on the objects and not on primitive data types.



    }
}
