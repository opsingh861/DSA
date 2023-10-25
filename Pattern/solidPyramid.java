// Geek is very fond of patterns. Once, his teacher gave him a  pattern to solve. He gave Ram an integer n and asked him to build a pattern.

// Help Ram build a pattern.

// Example 1:

// Input: 5

// Output:
//     *
//    ***  
//   *****
//  *******
// *********
// Your Task:
// You don't need to input anything. Complete the function printTriangle() which takes  an integer n  as the input parameter and print the pattern.

// Constraints:

// 1<= N <= 20

class Solution {

    void printTriangle(int n) {
        // code here
        int temp = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= n - i) {
                    System.out.print(" ");
                }

            }
            for (int k = 0; k < temp; k++) {
                System.out.print("*");
            }
            System.out.println();
            temp += 2;
        }

    }
}
