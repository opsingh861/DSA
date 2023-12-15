import java.util.*;

public class ArraySortZeroOneTwo {

  public static void bruteForce(ArrayList<Integer> arr, int n) {
    int zeroes = 0;
    int ones = 0;
    int twos = 0;
    for (int i = 0; i < n; i++) {
      if (arr.get(i) == 0) {
        zeroes++;
      } else if (arr.get(i) == 1) {
        ones++;
      } else {
        twos++;
      }
    }

    for (int i = 0; i < zeroes; i++) {
      arr.set(i, 0);
    }

    for (int i = zeroes; i < ones + zeroes; i++) {
      arr.set(i, 1);
    }

    for (int i = ones + zeroes; i < n; i++) {
      arr.set(i, 2);
    }
  }

  public static void optimal(ArrayList<Integer> arr, int n) {
    int low = 0;
    int mid = 0;
    int high = n - 1;
    while (mid <= high) {
      if (arr.get(mid) == 0) {
        Collections.swap(arr, low, mid);
        low++;
        mid++;
      } else if (arr.get(mid) == 1) {
        mid++;
      } else {
        Collections.swap(arr, mid, high);
        high--;
      }
    }
  }

  public static void main(String[] args) {
    int n = 8;
    ArrayList<Integer> arr = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      arr.add(sc.nextInt());
    }
    bruteForce(arr, n);
    System.out.println(arr);
  }
}
