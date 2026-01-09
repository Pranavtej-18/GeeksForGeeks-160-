class Solution {
    
    private void LPS(String pat, int[] lps)
    {
        int len = 0,i = 1;
        while(i < pat.length())
        {
            if(pat.charAt(len) == pat.charAt(i))
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
    
    public boolean areRotations(String s1, String s2) {
        // code here
        if(s1.equals(s2))
            return true;
            
        if(s1.length() != s2.length())
            return false;
            
        s1 = s1 + s1;
        
        int[] lps = new int[s2.length()];
        
        LPS(s2, lps);
        
        int i = 0, j = 0;
        
        int n = s1.length(), m =s2.length();
        while(i < n)
        {
            if(s1.charAt(i) == s2.charAt(j))
            {
                i++;
                j++;
                
                if(j == m)
                {
                    return true;
                }
            }else
            {
                if(j == 0)
                {
                    i++;
                }else
                {
                    j = lps[j-1];
                }
            }
        }
        return false;
    }
}

public class LPSOptimal 
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        System.out.println(obj.areRotations("aaaaaabbbbbaaaaabcdaaa", "bbbbaaaaabcdaaaaaaaaab"));
    }
}
