public class RotateTheArray {

  public static void reverse(int arr[]) {
    int n = arr.length;
    int i = 0;
    int j = n - 1;
    while (i < j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
  }

  public static void rotate(int arr[][], int n, int m) {
    // for (int i = 0; i < n; i++) {
    //   reverse(arr[i]);
    // }
    // for (int i = 0; i < n; i++) {
    //   for (int j = i + 1; j < m; j++) {
    //     int temp = arr[i][j];
    //     arr[i][j] = arr[j][i];
    //     arr[j][i] = temp;
    //   }

    // }
    for (int i = 0; i < n; i++) {
      reverse(arr[i]);
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      int t = n - 1;
      for (int j = 0; j < m - count; j++) {
        int temp = arr[i][j];
        arr[i][j] = arr[t][n - 1 - i];
        arr[t][n - 1 - i] = temp;
        t--;
      }
      count++;
    }
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int n = arr.length;
    int m = arr[0].length;
    rotate(arr, n, m);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
