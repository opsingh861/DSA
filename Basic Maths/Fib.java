import java.math.*;

public class Fib {

//   static int fib(int n) {
//     if (n <= 1) {
//       return n;
//     }
//     return fib(n - 1) + fib(n - 2);
//   }

  static int fib1(int n) {
    // const double phi = (1 + sqrt(5)) / 2;
    // return round((pow(phi, n) - pow(-1/phi, n)) / sqrt(5));
    return (int) Math.round(
      (
        Math.pow((1 + Math.sqrt(5)) / 2, n) -
        Math.pow((1 - Math.sqrt(5)) / 2, n)
      ) /
      Math.sqrt(5)
    );
  }

  public static void main(String[] args) {
    int n = 5;
    int sum = 0;
    // for (int j = 1; j <= n; j++) {
    //     sum += fib(j);
    // }
    // System.out.println(sum);
    // time in nanoseconds
    long startTime = System.nanoTime();
    // System.out.println(fib1(n));
    // System.out.println(fib(n));
    long endTime = System.nanoTime();
    long timeElapsed = endTime - startTime;
    System.out.println("Execution time in nanoseconds: " + timeElapsed);
  }
}