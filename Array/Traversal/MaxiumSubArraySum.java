import java.util.*;

public class MaxiumSubArraySum {

  public static int bruteForce(int[] v) {
    int n = v.length;
    int max = v[0];
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int j = i; j < n; j++) {
        sum = sum + v[j];
        if (sum > max) {
          max = sum;
        }
      }
    }
    return max;
  }

  public static int optimal(int v[]) {
    int n = v.length;
    int max = 0;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + v[i];
      if (sum > max) {
        max = sum;
      }
      if (sum < 0) {
        sum = 0;
      }
    }
    return max;
  }

  public static void main(String[] args) {
    int n = 5;
    int arr[] = { -53, 75, 56, 56, 56 };
  }
}
