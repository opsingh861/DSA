import java.util.*;
public class SubArrayWithXOR_K {
    public static int subarraysWithXORK(int []a, int b) {
        // Write your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(0,1);
        int count = 0;  
        int n = a.length;
        int xor = 0;
        for(int i=0;i<n;i++)
        {
            xor = xor^ a[i];
            if(xor==b) count++;
            int x = xor^b;
            if(map.containsKey(x))
            {
                count += map.get(x);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 6, 4 };
        System.out.println(subarraysWithXORK(arr,6));
    }
}
