public class sol3 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("second Largest Number in arr:" + getSecondLargest(arr));
        
        // int[] arr = {10, 10, 10};
        // System.out.println("second Largest Number in arr:",getSecondLargest(arr));
    }
    public static int getSecondLargest(int[] arr) {
        
        if(arr.length < 2) // since arr may be is of one element
            return -1;
            
        int greatestElement = -1,secondGreatestElement = -1;
        
        for(int a:arr) {
            if(a > greatestElement) {
                secondGreatestElement = greatestElement;
                greatestElement = a;
            }else if(a > secondGreatestElement && a!=greatestElement)
                secondGreatestElement = a;
        }
        return secondGreatestElement;
    }
}

