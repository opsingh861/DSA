import java.util.HashMap;
import java.util.PriorityQueue;

public class SortStringByFrequency {

  public String frequencySort(String s) {
    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    PriorityQueue<Character> pq = new PriorityQueue<>((a, b) ->
      map.get(b) - map.get(a)
    );
    pq.addAll(map.keySet());
    StringBuilder str = new StringBuilder("");
    while (!pq.isEmpty()) {
      char temp = pq.poll();
      for (int i = 0; i < map.get(temp); i++) {
        str.append(temp);
      }
    }

    return str.toString();
  }

  public static void main(String[] args) {
    SortStringByFrequency obj = new SortStringByFrequency();
    String s = "tree";
    System.out.println(obj.frequencySort(s));
  }
}
