public class Main {
    public static void main(String[] args) {
        String s1 = "110111000";
        String s2 = "0001111100";
        /* 876543210
         * 110111000  => 256 + 128 + 32 + 16 + 8 = 184 + 256 = 440
         *   1111100  => 64 + 32 + 16 + 8 + 4 = 124
         *1000110100 => 512 + 32 + 16 + 4 = 564 
         */

        s1 = trimZeros(s1);
        s2 = trimZeros(s2);

        int n1 = s1.length();
        int n2 = s2.length();

        System.out.println(addBinaryStrings(s1,n1,s2,n2));

    }

    static String addBinaryStrings(String s1, int n1, String s2, int n2) {
        
        // reduces extra traversal
        int i = n1-1;
        int j = n2-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(i>=0 || j>=0 || carry == 1)
        {
            int sum = carry;
            if(i>=0) sum+=s1.charAt(i--)-'0';
            if(j>=0) sum+=s2.charAt(j--)-'0';

            res.append(sum%2);
            carry = sum/2;
        }
        return res.reverse().toString();

    }

    static String trimZeros(String s) {

        // find non-zero number i.e., 1's position
        int zero1 = s.indexOf('1');

        return (zero1 == -1)? "0" : s.substring(zero1);
    }
}
