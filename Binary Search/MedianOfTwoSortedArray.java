public class MedianOfTwoSortedArray {
    public static double median(int[] a, int[] b) {
    	// Write your code here.
        int n1 = a.length;
        int n2 = b.length;
        if(n1>n2) return median(b,a);
        int n = n1 + n2;

        int low = 0;
        int high = n1;

        int left = (n1+n2+1)/2; // this is the number of element on the left side;

        while(low<=high)
        {
            int mid1 = (low+high)/2;
            int mid2 = left - mid1; // remaining elements to select from b[]

            int l1 = Integer.MIN_VALUE, l2 = Integer.MIN_VALUE; // as they are on left side so they need to be less from right side
            int r1 = Integer.MAX_VALUE, r2 = Integer.MAX_VALUE;

            if(mid1-1>=0) l1 = a[mid1-1];
            if(mid2-1>=0) l2 = b[mid2-1];

            if(mid1<n1) r1 = a[mid1];
            if(mid2<n2) r2 = b[mid2];

            if(l1<=r2 && l2<=r1)
            {
                if(n%2==1) return (double) Math.max(l1,l2);
                else return (double) (Math.max(l1,l2) + Math.min(r1,r2))/2;
            }
            else if(l1>r2) high = mid1-1;
            else low = mid1+1;
            


        }
        return 0;
        
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int arr[]  = new int[n+m];
        int left = 0;
        int right = 0;
        int count=0;
        while(left<n && right < m)
        {
            if(nums1[left]<=nums2[right])
            {
                arr[count++] = nums1[left++];
            }
            else
            {
                arr[count++] = nums2[right++];
            }
        }
        while(left<n)
        {
                   arr[count++] = nums1[left++];
        }
        
        while(right<m)
        {
        arr[count++] = nums2[right++];

        }

        int newLength = arr.length;
        double ans = 0;
        if((newLength)%2 ==1)
        {
            ans =arr[(newLength-1)/2];
        }
        else
        {
            int mid = (newLength-1)/2;
            ans = (arr[mid]+arr[mid+1])/(2.0);
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2};
        int nums2[] = {3,4};
        MedianOfTwoSortedArray obj = new MedianOfTwoSortedArray();
        System.out.println(obj.findMedianSortedArrays(nums1, nums2));
    }
}
