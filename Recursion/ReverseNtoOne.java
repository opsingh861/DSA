import java.util.Arrays;

public class ReverseNtoOne {
    public static void main(String[] args) {
        int x = 5;
        int ans[] = new int[x];
        int count = 0;
        recursionFunction(x, ans,count);
        System.out.println(Arrays.toString(ans));
    }

    static void recursionFunction(int x, int ans[],int count) {
        if (x < 1) {
            return;
        }
        ans[count] = x;
        recursionFunction(x - 1, ans,count);
    }
}
