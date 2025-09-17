public class sol1{
    public static void main(String[] args) {
        int[] A = {-2, 3, -6, 10, 0, -2};
        findBig(A,A.length);
    }
    public static void findBig(int[] A, int n) {
        int resSum  = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int maxSum = 1;
            for(int j=i;j<n;j++) {
                maxSum = maxSum*A[j];
                resSum = Math.max(resSum, maxSum);
            }
        }
        System.out.println(resSum);
    }
}