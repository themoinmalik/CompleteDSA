package src.SlidingWindows;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequency {


    //Input: SUCCESS
    //output: s3u1c2e1

    public static void main(String[] args) {

        String str = "SUCCESS";

        char[] chars = str.toCharArray();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c:chars){
            map.put(c, map.getOrDefault(c,0) +1);
        }

//        System.out.println(map);

        //print in this format:
//        s3u1c2e1

        StringBuilder resuilt = new StringBuilder();

        for (Map.Entry<Character, Integer> m: map.entrySet()){
            resuilt.append(m.getKey()).append(m.getValue());
        }


        System.out.println(resuilt);


    }




}
