package src.easyseries;

import java.util.HashMap;
import java.util.Map;

class Solution {


    public static void main(String[] args) {

       String[]  words = new String[]{"cat","bt","hat","tree"};
       String chars = "atach";

       int ans = countCharacters(words, chars);
        System.out.println(ans);

    }
        public static int countCharacters(String[] words, String chars) {


            int sum = 0;
            Map<Character, Integer> map = new HashMap<>();

            for(char ch: chars.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }


            for (int i =0;i<words.length;i++){

                sum = sum + words[i].length();
                for (char c: words[i].toCharArray()){
                    if (!map.containsKey(c)){
                        sum = sum - words[i].length();
                        break;
                    }

                }
            }


            return sum;

        }
    }

