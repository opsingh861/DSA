public class SingleNumber {
    public static int singleNumber(int[] a) {
        int ans = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            ans = ans ^ a[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 1, 4 };
        int ans = singleNumber(a);
        System.out.println(ans);
    }
}
