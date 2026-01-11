import java.util.Arrays;

class Solution
{
    public int hIndex(int[] nums)
    {

        // sort the array
        Arrays.sort(nums);

        // iterate from left to right to search index
        int idx = 0;
        int n = nums.length;

        while(idx < n && nums[n-1-idx] > idx)
            idx++;

        return idx;
    }
}

public class NormalSort 
{
    public static void main(String[] args)
    {
        Solution obj = new Solution();
        int[] nums = {6, 0, 2, 6, 3};
        int hId = obj.hIndex(nums);
        System.out.println(hId);
    }
}
