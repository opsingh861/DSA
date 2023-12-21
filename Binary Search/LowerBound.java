public class LowerBound {

  public static int lowerBound(int arr[], int x) {
    int n = arr.length;
    int ans = n;
    int low = 0;
    int high = n - 1;
    int mid = (low + high) / 2;
    while (low <= high) {
      if (arr[mid] >= x) {
        ans = mid;
        high = mid - 1;
      } else {
        low = mid + 1;
      }
      mid = (low + high) / 2;
    }
    return ans;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 3, 3, 4, 5, 6, 7 };
    int x = 0;
    System.out.println(lowerBound(arr, x));
  }
}
