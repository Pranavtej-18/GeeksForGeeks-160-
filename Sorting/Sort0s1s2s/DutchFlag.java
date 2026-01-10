
class Solutions
{
    public void sort012(int[] A)
    {
        // low, mid, high
        // 0-low => all 0s
        // low-mid => all 1s
        // high-n-1 => all 2s
        // mid-high => remainings

        int l=0,m=0,h=A.length-1;

        while(h >= m)
        {
            if(A[m] == 0)
            {
                // swap with A[i]
                int t = A[l];
                A[l++] = 0;
                A[m++] = t;
            }else if(A[m] == 1)
            {
                // its correct position
                m++;
            }else
            {
                // swap mid and high
                int t = A[m];
                A[m] = A[h];
                A[h--] = t;
            }
        }
    }
}

public class DutchFlag 
{
    public static void main (String[] args)
    {
        Solutions obj = new Solutions();
        int[] A = {2, 0, 2, 1, 0, 0, 1};

        obj.sort012(A);
        for(int a: A)
        {
            System.out.print(a+" ");
        }
    }    
}