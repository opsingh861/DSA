import java.util.*;

public class MajorityElement2 {

  public static List<Integer> majorityElement(int[] v) {
    // Write your code here

    int cnt1 = 0, cnt2 = 0;
    int n = v.length;
    List<Integer> list = new ArrayList<>();
    if (n == 1) {
      list.add(v[0]);
      return list;
    }
    if (n <= 2) {
      list.add(v[0]);
      list.add(v[1]);
      Collections.sort(list);
      return list;
    }
    int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
    for (int i = 0; i < n; i++) {
      if (cnt1 == 0 && v[i] != ele2) {
        cnt1 = 1;
        ele1 = v[i];
      } else if (cnt2 == 0 && v[i] != ele1) {
        cnt2 = 1;
        ele2 = v[i];
      } else if (v[i] == ele1) {
        cnt1++;
      } else if (v[i] == ele2) {
        cnt2++;
      } else {
        cnt1--;
        cnt2--;
      }
    }
    double ct1 = 0;
    double ct2 = 0;
    for (int i = 0; i < n; i++) {
      if (v[i] == ele1) ct1++;
      if (v[i] == ele2) ct2++;
    }
    if (ct1 > Math.floor(n / 3)) list.add(ele1);
    if (ct2 > Math.floor(n / 3)) list.add(ele2);
    Collections.sort(list);
    return list;
  }

  public static List<Integer> usingHashMap(int[] v) {
    // Write your code here
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    int n = v.length;
    double forMaj = Math.floor(n / 3) + 1;
    for (int i = 0; i < n; i++) {
      map.put(v[i], map.getOrDefault(v[i], 0) + 1);
      if (map.get(v[i]) == forMaj) {
        list.add(v[i]);
      }
      if (list.size() == 2) {
        break;
      }
    }
    Collections.sort(list);
    return list;
  }

  public static void main(String[] args) {
    int v[] = { 1, 1, 1, 3, 3, 2, 2, 2 };
    List<Integer> ans = majorityElement(v);
    for (int i = 0; i < ans.size(); i++) {
      System.out.print(ans.get(i) + " ");
    }

  }
}
