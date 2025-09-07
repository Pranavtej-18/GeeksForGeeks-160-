public class sol1 {
    public static void main(String[] args){
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("second Largest Number in arr:" + getSecondLargest(arr));
        
        // int[] arr = {10, 10, 10};
        // System.out.println("second Largest Number in arr:",getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {

        int greatestElement = -1;

        // finds first largest element
        for(int a:arr) {
            greatestElement = Math.max(a, greatestElement);
        }

        int n = arr.length;

        int[] arr2 = new int[n];

        // in second array we just put -1 at the place of largest element
        for(int i=0;i<n;i++) {
            if(arr[i]==greatestElement){
                arr2[i] = -1;
            }else{
                arr2[i] = arr[i];
            }
        }

        int secondGreatestElement = -1;

        // finds second largest element
        for(int a:arr2) {
            secondGreatestElement = Math.max(a, secondGreatestElement);
        }

        return secondGreatestElement;
    }
}