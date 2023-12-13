import java.util.*;

public class LongestSubArrayWithSumK {
    public static int longestSubarrayWithSumK(int[] a, long k) {
        int ans = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            for (int j = i + 1; j < n; j++) {
                if (temp == k) {
                    ans = Math.max(ans, j - i);
                    break;
                }
                temp += a[j];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2,3,1,1,1,1 };
        int k = 3;
        System.out.println(longestSubarrayWithSumK(a, k));
    }
}
