public class sol1 {
    public static void main(String[] args) {
        int[] A = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(maxSum(A,A.length));
    }

    public static int maxSum(int[] A, int n) {
        int maxx = A[0];
        for(int i=0;i<n;i++) {
            int currSum = 0;
            for(int j=0;j<n;j++) {
                int idx = (i+j)%n;
                currSum += A[idx];
                maxx = Math.max(maxx, currSum);
            }
        }
        return maxx;
    }
}