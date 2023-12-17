public class SpiralMatrix {

  public static int[] spiralMatrix(int[][] arr) {
    // Write your code here.
    int n = arr.length;
    int m = arr[0].length;
    int ans[] = new int[m * n];
    int index = 0;
    int top = 0;
    int left = 0;
    int bottom = n - 1;
    int right = m - 1;

    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        ans[index] = arr[top][i];
        index++;
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        ans[index] = arr[i][right];
        index++;
      }
      right--;
      // if(top<=bottom){

      for (int i = right; i >= left; i--) {
        ans[index] = arr[bottom][i];
        index++;
      }
      bottom--;
      // }
      // if(left<=right)
      // {

      for (int i = bottom; i >= top; i--) {
        ans[index] = arr[i][left];
        index++;
      }
      left++;
      // }
    }

    return ans;
  }

  public static void main(String[] args) {
    int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int ans[] = spiralMatrix(arr);
    for (int i = 0; i < ans.length; i++) {
      System.out.print(ans[i] + " ");
    }
  }
}
