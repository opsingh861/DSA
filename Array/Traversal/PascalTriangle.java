public class PascalTriangle {

  public static long NCR(int n, int r) {
    //   this is for telling the element present in the nth row and rth column
    // formula = n-1Cr-1 = n-1! / (n-r)! * r!
    long ans = 1;
    for (int i = 0; i < r; i++) {
      ans = ans * (n - i);
      ans = ans / (i + 1);
    }
    return ans;
  }

  public static void printRow(int n) {
    long ans = 1;
    for (int i = 0; i <= n; i++) {
      System.out.print(ans + " ");
      ans = ans * (n - i);
      ans = ans / (i + 1);
    }
  }

  public static int [][] pascalTriangle(int n) {
    int arr[][] = new int[n][];
    for (int i = 0; i < n; i++) {
        int temp[] = new int[i+1];
        int ans = 1;
        for (int j = 0; j <= i; j++) {
            temp[j] = ans;
            ans = ans * (i - j);
            ans = ans / (j + 1);
        }
        arr[i] = temp;
    }
    return arr;
  }

  public static int[][] myApproach(int n) {
    int arr[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
        int temp[] = new int[i+1];
        for (int j = 0; j <= i; j++) {
            if(j==0 || j==i){
                temp[j] = 1;
            }else{
                temp[j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }
        arr[i] = temp;
    }
    return arr;
  }

  public static void main(String[] args) {
    int n = 5;

    // printRow(5);
    // System.out.println(NCR(1, 1));
    System.out.println(Math.ceil(5.8));
    System.out.println(Math.floor(5.8));
  }
}
