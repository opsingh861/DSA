// Geek is very fond of patterns. Once, his teacher gave him a pattern to solve. He gave Geek an integer n and asked him to build a pattern.

// Help Geek to build a star pattern.

// Example 1:

// Input: 5

// Output:
// 1 
// 0 1 
// 1 0 1
// 0 1 0 1 
// 1 0 1 0 1

// Your Task:

// You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

// Constraints:

// 1<= N <= 20
class AlternateNumber {
    public static void main(String[] args) {
        // Solution obj = new Solution();
        // obj.printTriangle(5);
        // int temp = 1;
        // System.out.println(temp+=2);

        Solution obj = new Solution();
        obj.printTriangle(5);
    }
}

// class Solution {

// void printTriangle(int n) {
// // code here
// int start =1;
// for(int i=0;i<n;i++){
// if(i%2==0)
// {
// start=1;
// }
// else{
// start =0;
// }
// for(int j=0;j<=i;j++){
// System.out.print(start+" ");
// start = 1-start;
// }
// System.out.println();
// if(1==2);
// }
// }
// }

// 1 1
// 1 2 2 1
// 1 2 3 3 2 1
// 1 2 3 4 4 3 2 1
// 1 2 3 4 5 5 4 3 2 1

// class Solution {

// void printTriangle(int n) {
// // code here
// int something = 2*(n-1);
// // System.out.println(something);
// for(int i=1;i<=n;i++){
// for(int j=1;j<=i;j++)
// {
// System.out.print(j);
// // System.out.print(" ");
// }
// // remove one space
// // System.out.print("\b");
// for(int k=1;k<=something;k++)
// {
// System.out.print(" ");
// }

// for(int l=i;l>=1;l--){
// System.out.print(l);
// }
// System.out.println();
// something-=2;
// }
// }
// }

class Solution {

    void printTriangle(int n) {
        // code here
        int temp = 65 +n -1;
        char c = (char) temp;
        
        // System.out.println((char)c+n);
    }
}