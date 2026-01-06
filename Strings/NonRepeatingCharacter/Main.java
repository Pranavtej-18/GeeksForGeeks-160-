import java.util.Arrays;
public class Main
{
    public static void main(String[] args)
    {
        String s = "geeksforgeeks";

        // we need to identify the first non repeating character in a string
        // In our string it is 'f' as it is non repeated and first character

        System.out.println(findChar(s));
    }

    private static char findChar(String s)
    {
        int[] freq = new int[26];
        Arrays.fill(freq, -1);

        for(int i=0;i<s.length();i++)
        {
            int id = s.charAt(i)-'a';
            if(freq[id] == -1)
            {
                freq[id] = i;
            }else
            {
                freq[id] = -2;
            }
        }



        int idx = -1;
        for(int i=0;i<26;i++)
        {
            if(freq[i] >= 0 && (idx == -1 || freq[i] < freq[idx]))
            {
                idx = i;
            }
        }

        return idx==-1?'$':s.charAt(freq[idx]);
    }
}