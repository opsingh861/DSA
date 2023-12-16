import java.util.HashMap;

public class SubArrayEqualSumK {
     public int subarraySum(int[] arr, int s) {
            HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int count =0;
        int n = arr.length;
        map.put(0,1);
        for(int i =0;i<n;i++)
        {   sum +=arr[i];
          
            if(map.containsKey(sum-s) )
            {
          count+=map.get(sum-s);
            }
          map.put(sum,map.getOrDefault(sum,0)+1);
        }
        // if(s==0)
        // {
        //     count++;
        // }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 1 };
        int s = 3;
        SubArrayEqualSumK obj = new SubArrayEqualSumK();
        System.out.println(obj.subarraySum(arr,s));
    }
}
