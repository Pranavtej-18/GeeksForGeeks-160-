package Arrays.MajorityElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sol1 {
    public static void main(String[] args) {
        int arr[] = {7,7,8,8,8};
        findMajority(arr);
    }
    public static void findMajority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a:arr) {
            map.put(a,map.getOrDefault(a,0)+1);
        }
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > n/3){
                res.add(entry.getKey());
            }
        }
        Collections.sort(res);
        for(int i=0;i<res.size();i++) {
            System.out.print(res.get(i)+" ");
        }
    }
}
