public class Atoi {
    public int myAtoi(String str) {
        str = str.trim();
        int n = str.length();
        if(n==0) return 0;

        boolean negative = false;
        int index = 0;
        if(str.charAt(0)=='-')
        {
            index++;
            negative = true;
        }

       else if(str.charAt(0)=='+')
       {
           index ++;
       }
        int result = 0;
        while(index<n && Character.isDigit(str.charAt(index)))
        {
            int digit = str.charAt(index) - '0';

            if(result> (Integer.MAX_VALUE-digit)/10)
            {
                return negative?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }

            result = (result*10) + digit;

            index ++;
        }

        return negative?-result:result;
    }
    public static void main(String[] args) {
        Atoi obj = new Atoi();
        String s = "42";
        System.out.println(obj.myAtoi(s));
    }
}
