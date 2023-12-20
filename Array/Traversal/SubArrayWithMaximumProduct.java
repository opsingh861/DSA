public class SubArrayWithMaximumProduct {
    public static int subarrayWithMaxProduct(int []arr){
        // Write your code here.
                int max = Integer.MIN_VALUE;
        int pre = 1;
        int suf =1;
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(pre==0) pre=1;
            if(suf==0) suf=1;
            pre*=arr[i];
            suf*=arr[n-i-1];
            max = Math.max(max,pre);
            max = Math.max(max,suf);
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,-4,5,6};
        System.out.println(subarrayWithMaxProduct(arr));
    }
}
