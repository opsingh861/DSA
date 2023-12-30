public class MatrixMedian {

  public static int countSmallerThanMid(int[] A, int mid, int n) {
    int l = 0, h = n - 1;
    while (l <= h) {
      int md = (l + h) >> 1;
      if (A[md] <= mid) {
        l = md + 1;
      } else {
        h = md - 1;
      }
    }
    return l;
  }

  public static int findMedian(int matrix[][], int m, int n) {
    // Write your code here
    int low = Integer.MAX_VALUE;
    int high = Integer.MIN_VALUE;

    for (int i = 0; i < m; i++) {
      low = Math.min(low, matrix[i][0]);
      high = Math.max(high, matrix[i][n - 1]);
    }
    //     // int required = (m*n)/2;
    // int m = row;
    // int n = col;
    while (low <= high) {
      int mid = (low + high) >> 1;
      int cnt = 0;
      for (int i = 0; i < m; i++) {
        cnt += countSmallerThanMid(matrix[i], mid, n);
      }
      if (cnt <= (n * m) / 2) low = mid + 1; else high = mid - 1;
    }
    return low;
  }

  public static void main(String[] args) {
    int[][] matrix = { { 1, 3, 5 }, { 2, 6, 9 }, { 3, 6, 9 } };
    System.out.println(findMedian(matrix, 3, 3));
  }
}
