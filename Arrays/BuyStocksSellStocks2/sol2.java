public class sol2 {
    public static void main(String args[]) {
        int arr[] = {7, 10, 4, 6, 8, 10, 2};
        System.out.println(findProfit(arr));
    }
    public static int findProfit(int[] arr) {
        int n = arr.length;
        int profit = 0,minStock = arr[0];
        for(int i=0;i<n;i++) {
            minStock = Math.min(minStock, arr[i]);
            profit = Math.max(profit, arr[i]-minStock);
        }
        return profit;
    }
}
