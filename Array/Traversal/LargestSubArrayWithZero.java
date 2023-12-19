import java.util.*;

public class LargestSubArrayWithZero {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int max = 0;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            sum += arr[i];
            if(sum==0)
            {
                max = i+1;
            }
            else{
                 if(!map.containsKey(sum))
            {
                     map.put(sum,i);
            }
            if(map.containsKey(sum))
            {
                int temp = i- map.get(sum) ;
                max = Math.max(temp,max);
            }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        System.out.println(getLongestZeroSumSubarrayLength(arr));
    }
}
