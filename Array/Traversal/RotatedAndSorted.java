public class RotatedAndSorted {

    static public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
            }
        }
        if (nums[n - 1] > nums[0])
            count++;
        System.gc();
        return count <= 1;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 2 };
        System.out.println(check(nums));

    }
}
