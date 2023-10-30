import java.util.*;

public class MissingNumberInArray {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return total - sum;
    }

    public int bruteForce(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != count) {
                return count;
            }
            count++;
        }
        return count;
    }

    public int better(int[] nums) {
        int n = nums.length;
        // if(n==1) return 0;
        int arr[] = new int[n + 1];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            arr[nums[i]] += 1;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                ans = i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        MissingNumberInArray m = new MissingNumberInArray();
        int[] nums = { 3, 0, 1 };
        System.out.println(m.missingNumber(nums));
        System.out.println(m.better(nums));
        System.out.println(m.bruteForce(nums));
    }
}
