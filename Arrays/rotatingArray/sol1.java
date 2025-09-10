public class sol1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 5;
        rotateArray(arr,d);
        for(int a:arr)
            System.out.print(a+" ");
    }

    static void rotateArray(int[] arr, int d){
        while(d>0) {
            int LastNum = arr[arr.length-1];
            for(int i=arr.length-1;i>=1;i--) {
                arr[i] = arr[i-1];
            }
            arr[0] = LastNum;
            d--;
        }
    }
}