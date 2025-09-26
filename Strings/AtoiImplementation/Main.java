public class Main {
    public static void main(String[] args) {
        String s = "  -963w2389      ";
        System.out.println(toInteger(s));
    }

    public static long toInteger(String s) {
        long res = 0;
        int n =s.length();
        int i = 0;
        int sign = 1;

        // 1. remove trailing spaces
        while(i<n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. check for sign
        while(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if(s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // 3. turn strings to number
        while(i<n && Character.isDigit(s.charAt(i))) {

            if(res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && s.charAt(i)-'0' > 7)){
                return (sign == 1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }

            res = res*10 + (s.charAt(i)-'0');
            i++;
        }


        return sign*res;
    }
}