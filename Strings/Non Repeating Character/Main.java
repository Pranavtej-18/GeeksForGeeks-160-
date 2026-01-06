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
        int[] freq = new int[128];

        for(char c : s.toCharArray())
        {
            freq[c]++;
        }

        for(char c : s.toCharArray())
        {
            if(freq[c] == 1)
            {
                return c;
            }
        }

        return ' ';
    }
}