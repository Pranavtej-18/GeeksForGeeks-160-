public class sol1{
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        findLargestSubarraySum(arr, n);
    }
    public static void findLargestSubarraySum(int[] arr, int n) {
        int sumMAx = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int sum = 0;
            for(int j=i;j<n;j++) {
                sum+=arr[j];
                sumMAx = Math.max(sumMAx,sum);
            }
        }
        System.out.println(sumMAx);
    }
}