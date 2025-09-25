public class Sol1 {
    public static void main(String[] args) {
        String n = " -856h7 ";
        System.out.println(ATOI(n)); 
    }

    public static long ATOI(String n) {
        int size = n.length();
        int sign = 1;
        int i=0;

        // remove leading spaces
        while(i<size && n.charAt(i)==' ') {
            i++;
        }

        // find the symbol like(+, -)
        while(i<size && (n.charAt(i)=='+' || n.charAt(i)=='-')){
            if(n.charAt(i)=='-') {
                sign = -1;
            }
            i++;
        }

        // store answer in res
        long res = 0;

        // travel untill a character is digit
        while(i<size && Character.isDigit(n.charAt(i))){

            // handling overflow before updating the result value
            if(res > Integer.MAX_VALUE/10 || (res==Integer.MAX_VALUE/10 && n.charAt(i)-'0' > 7)) {
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res = res*10+(n.charAt(i)-'0');
            i++;
        }
        return res;
    }
}