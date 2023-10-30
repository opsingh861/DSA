import java.util.ArrayList;

public class RemoveDuplicateSorted {
    static public int removeDuplicates(int[] arr, int n) {
        // Write your code here.
        int count = 1;
        // for (int i = 0; i < n - 1; i++) {
        //     if (arr[i] != arr[i + 1]) {
        //         arr[count++] = arr[i];
        //     }
        // }
        // arr[count++] = arr[n - 1];
        int i =0;
        for(int j=1;j<n;j++)
        {
            if(arr[i]!=arr[j])
            {
                arr[count++] = arr[j];
                i=j;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 2, 3,4,5,5,5,5,5,5,5,5,5,5,5,5,5 };
        int n = arr.length;
        int k = removeDuplicates(arr, n);
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }

    }
}
