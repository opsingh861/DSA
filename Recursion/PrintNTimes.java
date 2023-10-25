import java.util.Scanner;

public class PrintNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        recursionFunction(n, s);
        for (String string : s) {
            System.out.print(string+" ");
        }
    }

    static void recursionFunction(int n, String s[]) {
        if (n == 0) {
            return;
        }
        recursionFunction(n - 1, s);
        s[n - 1] = "Coding Ninjas";
    }
}