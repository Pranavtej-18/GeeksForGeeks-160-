public class sol3 {
    public static void main(String[] args) {
        int[] A = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSum(A,A.length));
    }

    public static int maxSum(int[] A, int n) {
        int maxx = 0;
        int currmaxSum = 0,currminSum = 0;
        int maxSum = A[0],minSum = A[n-1];

        for(int i=0;i<A.length;i++) {
            currmaxSum = Math.max(currmaxSum+A[i], A[i]);
            maxSum = Math.max(maxSum, currmaxSum);

            currminSum = Math.min(currminSum+A[i],A[i]);
            minSum = Math.min(currminSum, minSum);

            maxx += A[i];
        }

        int nsum = maxSum;
        int csum = maxx-minSum;

        if(minSum == maxx) {
            return nsum;
        }
        return Math.max(nsum, csum);
    }
}
