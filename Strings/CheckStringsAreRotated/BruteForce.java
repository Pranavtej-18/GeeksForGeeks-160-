class Solution {
    
    public void rotate(char[] c)
    {
        int i, n = c.length;
        
        char ch = c[0];
        for(i=0;i<n-1;i++)
            c[i] = c[i+1];
            
        c[n-1] = ch;
    }
    
    public boolean check(char[] c1, char[] c2)
    {
        for(int i=0;i<c1.length;i++)
        {
            if(c1[i] != c2[i])
                return false;
        }
        return true;
    }
    
    
    public boolean areRotations(String s1, String s2) {
        
        if(s1.length() != s2.length())
            return false;
            
        if(s1.equals(s2))
            return true;
            
        int n = s1.length();
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        for(int i=0;i<n;i++)
        {
            rotate(c2); // n
            if(check(c1, c2)) // n
                return true;
        }
        
        return false;
     }
}

public class BruteForce
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        boolean areRotated = obj.areRotations("aaaaaabbbbbaaaaabcdaaa", "bbbaaaaabcdaaaaaaaabab");
        System.out.println(areRotated);
    }
}