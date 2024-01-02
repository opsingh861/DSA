public class SubarrayWithKDifferentChar {

  public static int countSubStrings(String str, int k) {
    // Write your code here.
    int n = str.length();
    if (k > n) return 0;
    int ans = 0;
    for (int i = 0; i < n; i++) {
      int arr[] = new int[26];
      int count = 0;
      for (int j = i; j < n; j++) {
        int temp = str.charAt(j) - 'a';

        if (arr[temp] == 0) {
          count++;
          arr[temp]++;
        }
        if (count == k) ans++;
        if (count > k) break;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    String str = "abcbaa";
    int k = 3;
    System.out.println(countSubStrings(str, k));
  }
}
