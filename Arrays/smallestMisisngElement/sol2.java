public class sol2{
    public static void main(String[] args) {
        int[] A = {-8, 0, 1, -7};
        System.out.println(findEle(A,A.length));
    }
    static int findEle(int[] A, int n){
        int res=0;
        boolean[] visited = new boolean[n+1];
        for(int i=0;i<n;i++) {
            if(A[i]>0 && A[i]<n) {
                visited[A[i]] = true;
            }
        }
        for(int i=1;i<n;i++) {
            if(visited[i]==false) {
                res = i;
                break;
            }
        }

        return res;
    }
}