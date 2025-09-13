public class sol1 {
    public static void main(String[] args) {
        int[] arr = {100, 162, 250, 360, 40, 50, 125, 600};
        findProfit(arr,arr.length);
        // 260 + 560
    }
    public static void findProfit(int[] arr, int n) {
        int profit=0;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i]-arr[i-1];
            }
        }
        System.out.println(profit);
    }
}
