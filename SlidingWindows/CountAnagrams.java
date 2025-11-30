package src.SlidingWindows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountAnagrams {

    public static void main(String[] args) {

        String text = "moin";
        String word = "malik";

        List<Integer> ans = countAnagram(text, word);
        System.out.println("ANSWER IS " + ans);

    }

    private static List<Integer> countAnagram(String text, String word) {

        int i = 0;
        int j = 0;
        int count = 0;
        int m = 0;
        int k = word.length();
        List<Integer> list = new ArrayList<>();

        HashMap<Character, Integer> map_word = new HashMap<>();

        while (m < word.length()) {
            map_word.put(word.charAt(m), map_word.getOrDefault(word.charAt(m), 0) + 1);
            m++;
        }

        HashMap<Character, Integer> map_test = new HashMap<>();
        for (j = 0; j < text.length(); j++) {

            map_test.put(text.charAt(j), map_test.getOrDefault(text.charAt(j), 0) + 1);

            if (j - i + 1 == k) {
                if (isAnagram(map_test, map_word)) {
                    list.add(i);
                }
                // reduce first value/count
                map_test.put(text.charAt(i), map_test.get(text.charAt(i)) - 1);
                i++;
            }
        }
        return list;
    }

    private static boolean isAnagram(HashMap<Character, Integer> mapTest, HashMap<Character, Integer> mapWord) {

        for (Character key : mapWord.keySet()) {
            if (mapTest.get(key) != mapWord.get(key)) {
                return false;
            }
        }
        return true;
    }

}
