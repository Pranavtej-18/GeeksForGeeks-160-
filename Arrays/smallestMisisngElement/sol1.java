public class sol1{
    public static void main(String[] args) {
        int[] A = {-8, 0, 1, -7};
        System.out.println(findEle(A,A.length));
    }
    static int findEle(int[] A, int n){
        int res = 1;
        for(int i=0;i<n;i++) {
            if(A[i] == res){
                res++;
            }
            else if(A[i] > res){
                break;
            }
        }
        return res;
    }
}