package src.easyseries;

import java.util.HashMap;
import java.util.Map;

public class EasySeries {

    public static void main(String[] args) {

        String c = "abcd";
        String s = "abcdx";

//        int sum = 0;
//        for (char ch: s.toCharArray()) {
//            sum = sum+ch;
//        }
//
//
//        for(char ch: c.toCharArray()){
//            sum = sum-ch;
//        }
//
//        System.out.println((char) sum);

        String st = "moin malik";
        String ch = "noim malik";

        System.out.println(String.valueOf(st).equals(ch));


    }

    // 1st ...
    public static Character findCharacter(String c, String t){

        Map<Character, Integer> map = new HashMap<>();

        int sum = 0;
        for (char ch: c.toCharArray()) {
            sum = sum+ch;
        }


        for (char ch: t.toCharArray()) {

            map.put(ch, map.get(ch)-1);
            if (map.get(ch) < 0){
                return ch;
            }

        }

        return 'c';


    }

    // 2nd ..



}
