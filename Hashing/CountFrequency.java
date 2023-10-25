public class CountFrequency {
    public static int[] countFrequency(int n, int x, int[] nums) {
        // Write your code here.
        int hash[] = new int[x + 1];
        for (int i = 0; i < n; i++) {
            hash[nums[i]] += 1;
        }
        int ans[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i] = hash[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 4, 1, 6, 7, 2 };
        int ans[] = countFrequency(8, 8, nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
