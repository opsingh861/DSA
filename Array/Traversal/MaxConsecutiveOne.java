public class MaxConsecutiveOne {
    // public int findMaxConsecutiveOnes(int[] arr) {
    // int n = arr.length;
    // int max = 0;
    // int count = 0;
    // int left = 0;
    // int right = 0;
    // while (left < n && right < n) {
    // if (arr[right] == 1) {
    // count++;
    // right++;
    // left++;
    // } else {
    // left++;
    // right = left;
    // count = 0;
    // }
    // if (count > max) {
    // max = count;
    // }
    // }
    // return max;
    // }

   static public int findMaxConsecutiveOnes(int[] arr) {
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 0;
            } else {
                currentLength++;
            }
        }

        return Math.max(maxLength, currentLength);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1 };
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
