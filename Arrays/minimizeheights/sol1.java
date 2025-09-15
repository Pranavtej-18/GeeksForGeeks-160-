import java.util.*;
public class sol1{
    public static void main(String[] args) {
        int[] A = {1, 5, 8, 10};
        int k = 2;
        minimizeHeights(A,k);
    }
    public static void minimizeHeights(int[] A, int k) {
        Arrays.sort(A);
        int minheight = A[0]+k;
        int maxheight = A[A.length-1]-k;
        int diff = maxheight-minheight;
        for(int i=1;i<A.length;i++) {
            if(A[i]-k < 0) {
                continue;
            }
            minheight = Math.min(minheight, A[i]-k);
            maxheight = Math.max(maxheight, A[i-1]+k);
            diff =   Math.min(maxheight-minheight,diff);
        }
        System.out.println(diff);
    }
}