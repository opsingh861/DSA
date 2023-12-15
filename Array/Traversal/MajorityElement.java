import java.util.Arrays;

public class MajorityElement {

  public static int majorityElement(int[] v) {
    // Write your code here
    Arrays.sort(v);
    int count = 1;
    int n = v.length;
    int ans = 0;
    if (n == 1) {
      return v[0];
    }
    for (int i = 1; i < n; i++) {
      if (v[i] == v[i - 1]) {
        count++;
        // System.out.println(count);
        if (count > n / 2) {
          ans = v[i];
          break;
        }
      } else {
        count = 1;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int n = 5;
    int arr[] = { -53, 75, 56, 56, 56 };

    System.out.println(majorityElement(arr));
  }
}
