import java.util.Arrays;

class Main 
{
    
    private static void LPS(String s, int[] lps)
    {
        lps[0] = 0;
        int i = 1;
        int len = 0;
        
        while(i<s.length())
        {
            if(s.charAt(i) == s.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }else
            {
                if(len == 0)
                {
                    lps[i] = 0;
                    i++;
                }else
                {
                    len = lps[len-1];
                }
            }
        }
    }
    
    public static int minChar(String s) 
    {
        
        StringBuilder orgStr = new StringBuilder(s);
        StringBuilder newStr = new StringBuilder(orgStr.append("$"));
        newStr.append(orgStr.reverse());
        
        // compute lps Array
        int[] lps = new int[newStr.length()];
        Arrays.fill(lps, 0);
        
        LPS(newStr.toString(), lps);
        
        // for(int num:lps)
        // {
        //     System.out.print(num + " ");
        // }
        
        return s.length()-lps[newStr.length()-1];
    }

    public static void main(String[] args)
    {
        System.out.println(minChar("aacecaaaa"));
    }
}