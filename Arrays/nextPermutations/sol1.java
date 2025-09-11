package Arrays.nextPermutations;

public class sol1 {
    public static void main(String[] args) {
        int A[] = {5,4,3,2,9};
        nextPermutations(A);
        for(int a:A) 
            System.out.print(a+" ");
    }

    public static void nextPermutations(int[] A) {
        int n = A.length;
        int d = -1;
        for(int i=n-1;i>0;i--) {
            if(A[i] > A[i-1]) {
                d = i-1;
                break;
            }
        }

        if(d == -1) {
            reverse(A,0,n-1);
            return;
        }

        for(int i=n-1;i>d;i--) {
            if(A[i] > A[d]) {
                int temp = A[i];
                A[i] = A[d];
                A[d] = temp;
                break;
            }
        }

        reverse(A,d+1,n-1);
    }

    static void reverse(int[] A, int low, int high) {
        while(low<high) {
            int temp = A[low];
            A[low] = A[high];
            A[high] = temp;
            low++;
            high--;
        }
    }
}
