public class sol2 {
    public static void main(String[] args) {
        int[] A = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSum(A,A.length));
    }

    public static int maxSum(int[] A, int n) {
        int[] prefixSum = new int[n];
        int[] suffixSum = new int[n];
        prefixSum[0] = A[0];
        suffixSum[n-1] = A[n-1];
        for(int i=1;i<n;i++) {
            prefixSum[i] = A[i] + prefixSum[i-1];
            suffixSum[n-i-1] = A[n-i-1] + suffixSum[n-i];
        }
        int maxx = 0;
        for(int i=0;i<n;i++) {
            if(i==0) maxx = suffixSum[1];
            else if(i==n-1) maxx = Math.max(maxx,prefixSum[i-1]);
            else    maxx = Math.max(maxx,prefixSum[i-1]+suffixSum[i+1]);
        }
        return maxx;
    }
}