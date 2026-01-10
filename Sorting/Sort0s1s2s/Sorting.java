import java.util.Arrays;

class Solutions
{
    public void sort012(int[] arr)
    {
        Arrays.sort(arr);
    }
}

public class Sorting 
{
    public static void main(String[] args)
    {
        Solutions obj = new Solutions();
        
        int[] A = {25, 7, 4, 26, 1};
        obj.sort012(A);

        for(int a: A)
        {
            System.out.print(a+" ");
        }
            
    } 
}
