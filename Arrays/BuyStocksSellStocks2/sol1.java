public class sol1{
    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 6, 8, 10, 2};
        System.out.println(findProfit(arr));
    }
    public static int findProfit(int[] arr) {
        int n = arr.length;
        int profit = 0;
        for(int i=0;i<n;i++) {
            int stockPrice = arr[i];
            for(int j=i+1;j<n;j++) {
                profit = Math.max(profit, arr[j]-stockPrice);
            }
        }
        return profit;
    }
}