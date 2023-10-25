import java.util.HashMap;
import java.util.Map;

public class HighestLowestFrequency {
    // public static int[] getFrequencies(int[] v) {
    // // Write Your Code Here
    // int max = Integer.MIN_VALUE;
    // for (int i = 0; i < v.length; i++) {
    // if (max < v[i])
    // max = v[i];
    // }
    // int hash[] = new int[max + 1];
    // // System.out.println(max);
    // for (int i = 0; i < v.length; i++) {
    // hash[v[i]] += 1;
    // }
    // max = Integer.MIN_VALUE;
    // int min = Integer.MAX_VALUE;
    // int ans[] = new int[2];
    // for (int i = 0; i < hash.length; i++) {
    // if (max < hash[i]) {
    // ans[0] = i;
    // max = hash[i];
    // }
    // if (hash[i] != 0 && min > hash[i]) {
    // ans[1] = i;
    // min = hash[i];
    // }
    // }
    // return ans;
    // }

    public static int[] getFrequencies(int[] v) {
        // Write Your Code Here
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0;i<v.length;i++)
        {
            hash.put(v[i], hash.getOrDefault(v[i], 0)+1);
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int ans[] = new int[2];
        int maxElement = 0;
        int minElement = 0;
        for(HashMap.Entry<Integer,Integer> entry:hash.entrySet())
        {
            int count = entry.getValue();
            int element = entry.getKey();
            if(max<count)
            {
                max = count;
                maxElement = element;
            }
            else if(max==count)
            {
              maxElement = Math.min(maxElement,element);
            }
            if(min>count)
            {
                min = count;
                minElement = element;
            }
            else if(min==count)
            {
                minElement = Math.min(minElement,element);
            }
        }
        ans[0] = maxElement;
        ans[1] = minElement;
        return ans;
    }

    public static void main(String[] args) {
        int v[] = { 10, 10, 10, 3, 3, 3 };
        int ans[] = getFrequencies(v);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
