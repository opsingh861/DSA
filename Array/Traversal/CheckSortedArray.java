public class CheckSortedArray {
    public static int isSorted(int n, int []a) {
        // Write your code here.
        for(int i=0;i<n-1;i++)
        {
            if(a[i]>a[i+1])
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        
    }
}
