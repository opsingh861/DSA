public class Hcf {
    public static int calcGCD(int n, int m){
        // Write your code here.
        // int temp =0;
        while(n>0 && m>0)
        {
            if(n>=m) n = n %m;
            else m = m %n;  
        }
        if(n==0) return m;
        return n;
    }
    public static void main(String[] args) {
    
        System.out.println(calcGCD(12, 18));
    }
}
