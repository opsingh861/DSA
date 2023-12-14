import java.util.*;

public class LongestSubArrayWithSumK {

  public static int longestSubarrayWithSumK(int[] nums, long k) {
    int n = nums.length;
    int i = 0;
    int j = 0;
    int maxLen = -1;
    int sum = 0;

    while (j < n) {
      sum += nums[j];
      if (sum == k) {
        maxLen = Math.max(maxLen, j - i + 1);
        j++;
      } else if (sum < k) {
        j++;
      } else {
		while (sum > k) {
		  sum -= nums[i];
		  i++;
		}
		j++;
      }
    }
    return maxLen;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 3 };
    int k = 6;
    System.out.println(longestSubarrayWithSumK(nums, k));
  }
}
