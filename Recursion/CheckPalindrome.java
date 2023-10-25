public class CheckPalindrome {
    static boolean check(int length, int count, String str) {
        if (count <= length) {
            if (str.charAt(count) != str.charAt(length))
                return false;
        return check(length - 1, count + 1, str);
        }
        return true;
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.
        // if(str=="skdpnyegmds") return false;
        int length = str.length() - 1;
        int count = 0;
        return check(length, count, str);
    }

    public static void main(String[] args) {
        // System.out.println(isPalindrome("skdpnyegmds"));
        System.out.println(isPalindrome("abcdjcba"));
    }
}