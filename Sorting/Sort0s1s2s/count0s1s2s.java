class Solutions
{
    public void sort012(int[] A)
    {
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        for(int a: A)
        {
            switch(a)
            {
            case 0: zeroCount++;
                    break;
            case 1: oneCount++;
                    break;
            case 2: twoCount++;
                    break;
            }
        }

        int idx = 0;
        while(zeroCount-- > 0)
            A[idx++] = 0;
        while(oneCount-- > 0)
            A[idx++] = 1;
        while(twoCount-- > 0)
            A[idx++] = 2;
    }
}

public class count0s1s2s 
{
    public static void main(String[] args)
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
