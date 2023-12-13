public class Traffic {
    public static int traffic(int n, int m, int[] vehicle) {
        // Write your code here.
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = m;
            int j = i;
            int arr[] = vehicle.clone();

            while (temp > 0 && j < n) {
                if (arr[j] == 0) {
                    arr[j] += 1;
                    temp--;
                }
                j++;
            }

            // for (int k : arr) {
            // System.out.print(k + " ");
            // }
            // System.out.println();
            int count = 0;
            int left = 0;
            int right = 0;

            while (left < n && right < n) {
                if (arr[right] == 1) {
                    count++;
                    right++;
                    left++;
                } else {
                    left++;
                    right = left;
                    count = 0;
                }
                if (count > max) {
                    max = count;
                }
            }

        }
        return max;
    }

    public static void main(String[] args) {
        int[] vehicle = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 };

        System.out.println(traffic(10, 3, vehicle));
    }
}
