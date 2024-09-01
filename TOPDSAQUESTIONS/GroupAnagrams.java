package src.TOPDSAQUESTIONS;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String str = "Moin Malik";
        char arr[] = str.toCharArray();

        String str1 = String.valueOf(arr);

        Map<String, List<String>> map = new HashMap<>();
        map.get(str).add(str1);

        System.out.println(map);

        System.out.println(arr);

    }


    public static List<List<String>> findAnagram(List<String> list){

        // 1st ...
        Map<String, List<String>> map = new HashMap<>();

        for (String s:list){

            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String sortedString = String.valueOf(arr);

            // check exists in a map or not...
            if (!map.containsKey(sortedString)){
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);

        }

        return new ArrayList<>(map.values());

    }
}
