// You are given a number n
// Find the number of digits of ‘n’ that evenly divide 'n’.
// Note:
// A digit evenly divides ‘n’ if it leaves no
// remainder when dividing ‘n’. |
// Example:
// Input: ‘n’ = 336 1
// Output: 3 ]
// Explanation:
// 336 is divisible by both ‘3’ and ‘6’. Since 3’ |
// occurs twice it is counted two times. |

// public class CountDigits {
//     public static int countDigits(int n) {
//         // Write your code here.
//         int temp = n;
//         int count = 0;
//         // if(n==0) return 1;
//         while (n > 0) {
//             int digit = n % 10;
//             if (digit == 0) {
//                 // count++;
//                 n = n / 10;
//                 continue;

//             }
//             if (temp % digit == 0)
//                 count++;
//             n = n / 10;
//         }
//         return count;
//     }
// }

// class CountDigits 
// {
//     public static void main(String[] args) {
//         int n = 123;
//         int count =(int) Math.log10(n) +1;
//         System.out.println(count);
//     }
// }

// time complexity - log10(n)