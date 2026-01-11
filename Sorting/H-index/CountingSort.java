class Solution
{
    public int hIndex(int[] nums)
    {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int i=0;i<n;i++)
        {
            if(nums[i] >= n)
            {
                freq[n]++;
            }else
            {
                freq[nums[i]]++;
            }
        }

        int idx = n;

        int s = freq[n];
        while(s < idx)
        {
            idx--;
            s += freq[idx];
        }

        return idx;
    }   
}

public class CountingSort 
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        int[] nums = {6, 0, 2, 6, 3};
        int hId = obj.hIndex(nums);
        System.out.println(hId);
    }
}
