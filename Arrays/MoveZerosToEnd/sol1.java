public class sol1{
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 4, 0, 5, 0};
        movezerosToEnd(arr,arr.length);
        for(int i=0;i<arr.length;i++) {
            if(i!=0) System.out.print(" "+arr[i]);
            else System.out.print(arr[i]);
        }
    }
    public static void movezerosToEnd(int[] arr, int n) {
        int[] newArr = new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
                newArr[j++] = arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = newArr[i];
        }
    }
}