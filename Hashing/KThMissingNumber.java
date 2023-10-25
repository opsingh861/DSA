public class KThMissingNumber {

    static int missingKTH(int vec[],int n,int k)
    {
        int ans = 0;
        int left = 0;
        int right = n-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(vec[mid]-mid-1>=k)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        return left+k;
    }

    public static void main(String[] args) {
        int vec[] = { 1, 2, 4, 5 };
        int k = 2;
        int n = vec.length;


    }
}
