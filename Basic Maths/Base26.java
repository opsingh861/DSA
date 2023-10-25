public class Base26 {
    public static void main(String[] args) {
        int num = 12334;
        StringBuilder answer = new StringBuilder("");
        while (num > 0) {
            int rem = num % 26;
            if (rem == 0) {
                answer.append('z');
                num = num / 26 - 1;
            } else {
                answer.append((char) (rem + 96));
                num = num / 26;
            }
        }
        System.out.println(answer.reverse());
    }
}
