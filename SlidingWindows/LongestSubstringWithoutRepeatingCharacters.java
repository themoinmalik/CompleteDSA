package src.SlidingWindows;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        String str = "abcabcbb";  // variable type..

        int ans = checkUniqueSubString(str);
        System.out.println(ans);
    }

    private static int checkUniqueSubString(String str) {


        int n = str.length();
        int max = Integer.MIN_VALUE;

        int i = 0;
        int j =0;
        Map<Character, Integer> map = new HashMap<>();

        while (j<n){

            char c = str.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);

            if (map.size()<j-i+1){
                while (map.size()<j-i+1){
                    char leftChar = str.charAt(i);
                    map.put(leftChar, map.get(leftChar)-1);
                    if (map.get(leftChar)==0){
                        map.remove(leftChar);
                    }
                    i++;
                }
            }

            if (map.size() == j-i+1){
                max = Math.max(max, j-i+1);
            }
            j++;
        }
        return max;
    }
}
