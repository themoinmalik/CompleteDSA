package src.easyseries;

import java.util.HashMap;
import java.util.Map;

class Solution {


    public static void main(String[] args) {

//       String[]  words = new String[]{"cat","bt","hat","tree"};
//       String chars = "attach";
//
//       int ans = countCharacters(words, chars);
//        System.out.println(ans);

        String st= "6777189990";
        Map<Character, Integer> map = new HashMap<>();

        for (char c: st.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> m : map.entrySet()){
            if (m.getValue() == 3){
                map.put(m.getKey(), ((int)m.getKey())*m.getValue());
            }
        }

        int maxkey  = map.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);

        // let's combine this...
//        map.entrySet().stream().
//                forEach(e-> map.put(e.getKey(), e.getKey()*e.getValue()))
//                .max;

        System.out.println(maxkey);


    }
        public static int countCharacters(String[] words, String chars) {

           int[] ch = new int[26];

           for (char c: chars.toCharArray()){
               ch[c-'a']++;
           }
           int ans = 0;

           for (String s:words){

               int[] newArr = new int[26];
               for (char c: s.toCharArray()){
                   newArr[c-'a']++;
               }

               boolean ok = true;

               for (int i =0;i<26;i++){
                   if (newArr[i]>ch[i]){
                       ok = false;
                       break;
                   }
               }


               if (ok == true){
                   ans = ans+s.length();
               }
           }

           return ans;

        }
    }

