import java.util.*;

public class SuperiorElement {

  public static List<Integer> superiorElement(int[] a) {
    int n = a.length;
    List<Integer> list = new ArrayList<>();
    int max = Integer.MIN_VALUE;
    for (int i = n - 1; i >= 0; i--) {
      if (a[i] > max) {
        list.add(a[i]);
        max = a[i];
      }
    }
    return list;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 2, 1 };
    System.out.println(superiorElement(arr));
  }
}
