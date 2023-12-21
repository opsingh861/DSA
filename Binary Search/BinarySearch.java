public class BinarySearch {

  public static int binarySearchRecursive(int nums[], int low, int high, int target) {
    if (low <= high) {
      int mid = (low + high) / 2;
      if (nums[mid] == target) {
        return mid;
      } else if (target > nums[mid]) {
        return binarySearchRecursive(nums, mid + 1, high, target);
      } else {
        return binarySearchRecursive(nums, low, mid - 1, target);
      }
    }
    return -1;
  }

  public static int search(int[] nums, int target) {
    // Write your code here.
    // int n = nums.length;
    int n = nums.length - 1;
    return binarySearchRecursive(nums, 0, n, target);
  }

  public static int binarySearch(int arr[], int key) {
    int low = 0;
    int high = arr.length - 1;
    int mid = (low + high) / 2;
    while (low <= high) {
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else if (arr[mid] > key) {
        high = mid - 1;
      }
      mid = (low + high) / 2;
    }
    return -1;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5 };

    System.out.println(binarySearch(arr, 3));
  }
}
