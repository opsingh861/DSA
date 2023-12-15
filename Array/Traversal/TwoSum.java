import java.util.*;

public class TwoSum {

  public static String bruteForce(int n, int book[], int target) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int sum = book[i] + book[j];
        if (sum == target) {
          return "YES";
        }
      }
    }
    return "NO";
  }

  public static String optimal(int n, int book[], int target) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < n; i++) {
      int diff = target - book[i];
      if (set.contains(diff)) {
        return "YES";
      }
      set.add(book[i]);
    }
    return "NO";
  }


  public static void main(String[] args) {
    int n = 5;
    int book[] = { 1, 2, 4, 3, 5 };
    int target = 9;

    System.out.println(bruteForce(n, book, target));
    System.out.println(optimal(n, book, target));

  }
}
