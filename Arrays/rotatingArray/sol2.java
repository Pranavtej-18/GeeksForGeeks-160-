public class sol2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int d = 36;
        rotateArr(arr,d);
        for(int a:arr) {
            System.out.print(a+" ");
        }
    }
    static void rotateArr(int arr[], int d) {
        d = d%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,arr.length-d-1);
        reverse(arr,arr.length-d,arr.length-1);
    }
    
    static void reverse(int[] arr, int low, int high) {
        while(low<high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}