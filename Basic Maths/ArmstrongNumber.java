public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        String s = Integer.toString(n);
        int length = s.length();
        while(n>0)
        {
            int r = n %10;
             sum +=(int) Math.pow(r,length);
             n/=10;
        }
        System.out.println(temp==sum);
    }
}
