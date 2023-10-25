import java.util.*;

public class SubArrayWithK {
    static int[] naive(int arr[], int k) {
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {

                if (sum < k) {
                    sum += arr[j];
                }
                if (sum == k) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    static int[] efficient(int arr[], int sum) {
        int ans[] = new int[2];
        int start = 0;
        int end = -1;
        int curSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if (curSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (map.containsKey(curSum - sum)) {
                start = map.get(curSum - sum) + 1;
                end = i;
                break;
            }
            map.put(curSum, i);
        }
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int k = 3;
        int ans[] = naive(arr, k);
        int ans1[] = efficient(arr, k);
        System.out.println(ans[0] + " " + ans[1]);
        System.out.println(ans1[0] + " " + ans1[1]);
    }
}
