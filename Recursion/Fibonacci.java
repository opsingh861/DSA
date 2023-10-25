public class Fibonacci {
    static int[] fib(int arr[],int i,int n)
    {
        if(i<n)
        {
            arr[i] = arr[i-1] + arr[i-2];
            return fib(arr,i+1,n);
        }
        if(i>=n)
        {
            return arr;
        }
        return fib(arr,i+1,n);
    }
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int arr[] = new int[n];
        arr[0] = 0;
        if(n<1)
        {
            return arr;
        }
        if(n==2)
        {
            arr[1] = 1;
            return arr;
        }
        if(n>2)
        {
            arr[1] = 1;
            arr = fib(arr,2,n);

        }
        return arr;
    }

    public static void main(String[] args) {
        // System.out.println(fib(6));
        int arr[] = generateFibonacciNumbers(6);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}