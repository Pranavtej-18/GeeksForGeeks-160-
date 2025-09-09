public class sol2 {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5, 6, 7};
        reverseArray(A,A.length);
        for(int a:A)
            System.out.print(a+" ");
        System.out.println();
    }

    static void reverseArray(int[] A, int N) {
        int i = 0;
        while(i<N/2) {
            int temp = A[i];
            A[i] = A[N-i-1];
            A[N-i-1] = temp;
            i++;
        }
    }
}
