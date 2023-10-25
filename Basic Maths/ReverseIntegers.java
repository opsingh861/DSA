// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:

// Input: x = 123
// Output: 321
// Example 2:

// Input: x = -123
// Output: -321
// Example 3:

// Input: x = 120
// Output: 21

public class ReverseIntegers {
    public static void main(String[] args) {
        int x = -1534236469;
        // boolean negative = false;
        // if (x < 0) {
        //     x *= -1;
        //     negative = true;
        // }
        long reversed = 0;
        while (x!=0) {
            int rem = x % 10;
            reversed = reversed * 10 + rem;
            x /= 10;
        }
        // if (negative)
        //     reversed *= -1;
            System.out.println(reversed);
        // if(reversed<Integer.MIN_VALUE || reversed>Integer.MAX_VALUE) return 0;
        // return reversed;

    }
}
