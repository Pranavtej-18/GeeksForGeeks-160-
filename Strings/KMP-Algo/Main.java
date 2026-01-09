import java.util.ArrayList;

public class Main
{
    private static void LPS(String p, int[] lps)
    {
        int n = p.length(), len = 0, i = 1;
        while(i < n)
        {
            // three conditions exist
            // 1.i and len are mathcing
            // 2.i and len aren't matching and len == 0
            // 3.i and len aren't matching and len > 0

            if(p.charAt(i) == p.charAt(len))
            {
                len++;
                lps[i] = len;
                i++;
            }else if((p.charAt(i) != p.charAt(len))  && (len == 0))
            {
                lps[i] = 0;
                i++;
            }else
            {
                len = lps[len-1];
            }
        }

    }

    private static void printArray(int[] Arr)
    {
        for(int a : Arr)
        {
            System.out.print(a+" ");
        }
    }

    public static void main(String[] args)
    {
        String s = "abcbabca";
        String p = "abc";

        // computing lps array
        int[] lps = new int[p.length()];
        LPS(p, lps);

        System.out.print("LPS Arrays: [ ");
        printArray(lps);
        System.out.println("]");

        int i = 0, j = 0, n = s.length(), m= p .length();
        ArrayList<Integer> result = new ArrayList<>();
        while(i < n)
        {
                if(s.charAt(i) == p.charAt(j))
                {
                    i++;
                    j++;

                    if(j == m)
                    {
                        result.add(i-j);
                        j = lps[j-1];
                    }
                }else
                {
                    if(j != 0)
                    {
                        j = lps[j-1];
                    }else
                    {
                        i++;
                    }
                }
        }
        System.out.print("Matching indices are : [ ");
        for(int id : result)
        {
            System.out.print(id+" ");
        }
        System.out.println("]");
    }
}