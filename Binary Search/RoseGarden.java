public class RoseGarden {
    public static boolean possible(int arr[],int day,int r,int b )
    {
        int count =0;
        int bqt = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                int temp= count/r;
                bqt+= temp;
                count=0;
            }
        }
        int temp = count/r;
        bqt+= temp;
        return bqt>=b;
    }
    public static int roseGarden(int[] arr, int r, int b) {
        // Write your code here.
        int n = arr.length;
        if(b*r>n) return -1;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            low = Math.min(low,arr[i]);
            high = Math.max(high,arr[i]);
        }
        
        int mid = (low+high)/2;

        while(low<=high)
        {
            boolean pos = possible(arr,mid,r,b);
            if(pos)
            { 
                high = mid-1;
            }
            else 
            {
                low = mid+1;
            }

            mid = (low+high)/2;
        }
        if(low>=0) return low;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 7, 11 };
        int r = 2;
        int b = 5;
        System.out.println(roseGarden(arr, r, b));
    }
}
