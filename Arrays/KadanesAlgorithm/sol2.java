public class sol2 {
    public static void main(String[] args) {
        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int n = arr.length;
        findLargestSubarraySum(arr, n);
    }
    public static void findLargestSubarraySum(int[] arr, int n) {
        int greatEnd = arr[0];
        int sum = arr[0];
        for(int i=0;i<n;i++) {
            greatEnd = Math.max(arr[i],greatEnd+arr[i]);
            sum = Math.max(sum, greatEnd);
        }
        System.out.println(sum);
    }
}
