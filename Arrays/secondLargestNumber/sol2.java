public class sol2 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("second Largest Number in arr:" + getSecondLargest(arr));
        
        // int[] arr = {10, 10, 10};
        // System.out.println("second Largest Number in arr:",getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        
        int greatestElement = -1;
        for(int a:arr) {
            greatestElement = Math.max(a, greatestElement);
        }
        int secondGreatestElement = -1;
        for(int a:arr) {
            if(a == greatestElement){
                continue;
            }
            secondGreatestElement = Math.max(a, secondGreatestElement);
        }
        return secondGreatestElement;
    }
}
