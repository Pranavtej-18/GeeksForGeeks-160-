public class sol1{
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(A,A.length);
        for(int a:A)
            System.out.print(a+" ");
        System.out.println();
    }

    static void reverseArray(int[] A, int N) {
        int[] newA = new int[N];
        for(int i=N-1;i>=0;i--) 
            newA[N-i-1] = A[i];
        for(int i=0;i<N;i++)
            A[i] = newA[i];
    }
}