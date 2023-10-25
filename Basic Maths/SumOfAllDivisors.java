public class SumOfAllDivisors {
    static int divisor(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                int temp = n / i;
                if (temp != i) {
                    sum += temp;
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int j = 1; j <= n; j++) {
            sum += divisor(j);
        }
        System.out.println(sum);
    }
}
