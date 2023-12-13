import java.util.*;

public class DistinctElement {
    public static int getSingleElement(int[] arr) {
        // Write your code here.
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == 1) {
                ans = arr[i];
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
