import java.util.*;

public class DistinctElementInWindow {
    static void naive(int arr[], int k) {
        int left = 0;
        int right = left + k-1;
        int n = (arr.length - k) + 1;
        while (n > 0) {
            Set<Integer> set = new HashSet<>();
            for (int i = left; i <= right; i++) {
                set.add(arr[i]);
            }
            System.out.println(set.size());
            left++;
            right++;
            n--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 20, 10, 30, 40, 10 };
        int k = 5;
        naive(arr, k);

    }
}
