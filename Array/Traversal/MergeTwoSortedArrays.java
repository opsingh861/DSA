import java.util.Arrays;

public class MergeTwoSortedArrays {

  public static void mergeTwoSortedArraysWithoutExtraSpace(long[] a, long[] b) {
    // Write your code here.
    int n = a.length;
    int m = b.length;
    int i = n - 1;
    int j = 0;
    while (i >= 0 && j < m) {
      if (a[i] > b[j]) {
        long temp = a[i];
        a[i] = b[j];
        b[j] = temp;
        i--;
        j++;
      } else {
        break;
      }
    }
    Arrays.sort(a);
    Arrays.sort(b);
  }

  public static void usingShellSort(long[] a, long[] b) {
    // Write your code here.
    int n = a.length;
    int m = b.length;
    int total = m + n;
    int gap = (total / 2) + (total % 2);

    while (gap >= 1) {
      int i = 0;
      int j = i + gap;

      while (j < total) {
        if (i < n && j >= n) {
          if (a[i] > b[j - n]) {
            long temp = a[i];
            a[i] = b[j - n];
            b[j - n] = temp;
          }
        } else if (i >= n) {
          if (b[i - n] > b[j - n]) {
            long temp = b[i - n];
            b[i - n] = b[j - n];
            b[j - n] = temp;
          }
        } else {
          if (a[i] > a[j]) {
            long temp = a[i];
            a[i] = a[j];
            a[j] = temp;
          }
        }
        i++;
        j++;
      }
      if (gap == 1) break;
      gap = (gap / 2) + (gap % 2);
    }
  }

  public static void main(String[] args) {
    long[] arr1 = { 1, 3, 5, 7 };
    long[] arr2 = { 0, 2, 6, 8, 9 };
    mergeTwoSortedArraysWithoutExtraSpace(arr1, arr2);
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }
}
