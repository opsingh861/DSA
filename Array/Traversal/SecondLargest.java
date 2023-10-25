public class SecondLargest {
    public static int[] getSecondOrderElements(int n, int[] a) {
        // Write your code here.
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > firstMax) {
                firstMax = a[i];
            }
            if (a[i] < firstMin) {
                firstMin = a[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (a[i] > secondMax && a[i] != firstMax) {
                secondMax = a[i];
            }
            if (a[i] < secondMin && a[i] != firstMin) {
                secondMin = a[i];
            }
        }
        int ans[] = new int[2];
        ans[0] = secondMax;
        ans[1] = secondMin;
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int ans[] = getSecondOrderElements(10, arr);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
