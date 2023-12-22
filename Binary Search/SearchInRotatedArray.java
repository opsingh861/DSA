public class SearchInRotatedArray {

  public static int search(int[] nums, int k) {
    int low = 0;
    int n = nums.length;
    int high = n - 1;
    int mid = (low + high) / 2;
    while (low <= high) {
      if (nums[mid] == k) {
        return mid;
      } else if (nums[low] <= nums[mid]) {
        if (nums[low] <= k && k <= nums[mid]) {
          high = mid - 1;
        } else {
          low = mid + 1;
        }
      } else {
        if (nums[mid] <= k && k <= nums[high]) {
          low = mid + 1;
        } else {
          high = mid - 1;
        }
      }
      mid = (low + high) / 2;
    }
    return -1;
  }

  public static void main(String[] args) {
    int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
    int x = 0;
    System.out.println(search(arr, x));
  }
}
