public class SumFirstN {
static long sumFirstN(  int n) {
    if (n == 1) {
        return 1;
    }
    return n + sumFirstN(n - 1);
}
    public static void main(String[] args) {
        int x = 5;
   
    }
}
