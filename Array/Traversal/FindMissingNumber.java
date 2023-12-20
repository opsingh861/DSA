public class FindMissingNumber {

  public static int[] findMissingRepeatingNumbers(int[] a) {
    // Write your code here
    int ans[] = new int[2];
    int n = a.length;
    int total = (n * (n + 1)) / 2;
    int dup = 0;
    int sum = 0;
    for (int i = 0; i < n - 1; i++) {
      if (a[i] == a[i + 1]) {
        dup = a[i];
        System.out.println(dup);
      }
      sum += a[i];
    }
    sum += a[n - 1];
    int diff = total - sum;
    int required = dup + diff;
    ans[0] = dup;
    ans[1] = required;
    return ans;
  }

  public static void main(String[] args) {
    int a[] = { 1, 2, 3, 2 };
    int ans[] = findMissingRepeatingNumbers(a);
    System.out.println(ans[0] + " " + ans[1]);
  }
}
