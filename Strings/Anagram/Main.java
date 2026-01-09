import java.util.*;

public class Main{
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseges";

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(char c:s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c,0)+1);
        }
        boolean isAnagram = true;
        for(char c:s1.toCharArray()) {
            if(map1.get(c) != map2.get(c)) 
                isAnagram = false;
        }
        if(isAnagram)
            System.out.println("s1 and s2 are Anagrams");
        else
            System.out.println("s1 and s2 are not Anagrams");

    }
}