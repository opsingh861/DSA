public class ValidPalindrome {
    static void remove(int n, String s, StringBuilder str) {
        if (n < s.length()) {
            if (s.charAt(n) >= 'a' && s.charAt(n) <= 'z' || s.charAt(n) >= '0' && s.charAt(n) <= '9') {
                str.append(s.charAt(n));
                remove(n + 1, s, str);
            }
        }
        // for(int i = 0; i < s.length(); i++) {
        // if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' &&
        // s.charAt(i) <= '9') {
        // str.append(s.charAt(i));
        // }
        // }
    }

    static boolean check(int n, StringBuilder str, int length) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(length)) {
                return false;
            }
            length--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase();
        StringBuilder str = new StringBuilder();
        int n = 0;
        remove(n, s, str);
        n = 0;
        int length = str.length() - 1;
        System.out.println(check(n, str, length));
        System.out.println(str);
    }
}
