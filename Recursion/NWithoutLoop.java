
// You are given an integer "n"
// Your task is to return an array containing integers from 1 to n (in
// increasing order) without using loops.


public class NWithoutLoop {
   public static void main(String[] args) {
      int n = 5;
      int arr[] = new int[n];
      recursionFunction(n, arr);
      for (int i : arr) {
         System.out.println(i);
      }

   }

   static void recursionFunction(int n, int arr[]) {
      if (n == 0) {
         return;
      }
      recursionFunction(n - 1, arr);
      arr[n - 1] = n;
   }
}