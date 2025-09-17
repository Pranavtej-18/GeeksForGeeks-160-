public class sol2{
    public static void main(String[] args) {
        int[] A = {-2, 3, -6, 10, 0, -2};
        findBig(A,A.length);
    }
    public static void findBig(int[] A, int n) {
        int resprod  = Integer.MIN_VALUE;
        int backprod = 1;
        int frontprod = 1;
        for(int i=0;i<n;i++) {
            if(backprod==0){
                backprod = 1*A[n-i-1];
            }else{
                backprod *= A[n-i-1];
            }
            if(frontprod==0){
                frontprod = 1*A[i];
            } else{
                frontprod *= A[i];
            }
            resprod = Math.max(frontprod,backprod);
        }
        System.out.println(resprod);
    }
}