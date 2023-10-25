public class Prime {
    public static void main(String[] args) {
        int num =5;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}
