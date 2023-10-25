import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = Integer.toString(n);
        StringBuilder answer = new StringBuilder("");
        // System.out.println(s);
        int len = s.length();
        int back = len - 1;
        int front = len - 2;
        while (front >= 0) {
            StringBuilder temp = new StringBuilder("");
            if (front == 1 && back == 3) {
                temp.append(s.charAt(0));
                temp.append(s.charAt(1));
                // System.out.println(temp);
                int num = Integer.parseInt(temp.toString());
                System.out.println(num);
                if (num <= 25) {
                    System.out.println((char) (num + 97));
                    answer.append((char) (num + 97));

                    front -= 2;
                    back -= 2;
                } else {
                    char c = temp.charAt(1);
                    answer.append((char) (c + 49));
                    front -= 1;
                    back -= 1;
                }

                // break;
            }
            temp.append(s.charAt(front));
            temp.append(s.charAt(back));
            int num = Integer.parseInt(temp.toString());
            System.out.println(num);
            if (num <= 25) {
                answer.append((char) (num + 97));
                front -= 2;
                back -= 2;
            } else {
                char c = temp.charAt(1);
                answer.append((char) (c + 49));
                front -= 1;
                back -= 1;
            }

        }

        System.out.println(answer.reverse());

        // StringBuilder temp = new StringBuilder("");
        // for(int i=0;i<26;i++){
        // temp.append((char)(i+97));
        // }
        // System.out.println(temp);

        // System.out.println('2'+49);
    }

    // String s = "123";
    // int n = Integer.parseInt(s);
    // System.out.println(n);
}

// a 0
// b 1
// c 2
// d 3
// e 4
// f 5
// g 6
// h 7
// i 8
// j 9
// k 10
// l 11
// m 12
// n 13
// o 14
// p 15
// q 16
// r 17
// s 18
// t 19
// u 20
// v 21
// w 22
// x 23
// y 24
// z 25