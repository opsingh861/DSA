import java.util.*;

public class FactorialNumbers {
    static long factorial(long count) {
        if (count == 1) {
            return 1;
        }
        return count * factorial(count - 1);
    }

    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        List<Long> list = new ArrayList<>();
        long count = 1;
        while (true) {
            long f = factorial(count);

            if (f > n) {
                return list;
            }
            list.add(f);
            count++;
        }

    }

    public static void main(String[] args) {
        System.out.println(factorialNumbers(5));
        // System.out.println(factorial(5));
    }
}
