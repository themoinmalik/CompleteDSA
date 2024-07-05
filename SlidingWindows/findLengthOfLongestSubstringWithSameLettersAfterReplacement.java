package src.SlidingWindows;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class findLengthOfLongestSubstringWithSameLettersAfterReplacement {

    public static void main(String[] args) {

        String str = "abcababb";
        int k = 2;

        int ans = checkLongestSubString(str, k);
        System.out.println(ans);
    }

    private static int checkLongestSubString(String str, int k) {


        Integer i =0;
        Map<Character, Integer> map = new HashMap<>();
        int ans = Integer.MIN_VALUE;

        for (Integer j = 0; j < str.length(); j++) {
            char c = str.charAt(j);
            map.put(c, map.getOrDefault(c, 0)+1);

            // find tyhe max coutn character...
            Optional<Integer> maxcount = map.values().stream().max(Integer::compareTo);

            while (j-i+1 - maxcount.get() >k){

                char ch = str.charAt(i);
                map.put(ch, map.get(ch)-1);
                i++;
            }

            if (j-i+1 - maxcount.get() == k){
                ans = Math.max(ans, j-i+1);
            }

        }


       return ans;


    }


}
