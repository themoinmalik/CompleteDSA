package src.string;

import java.util.*;

public class LenghtOfLastWord {

    public  static  int solution(String str) {
        str = str.trim();
        int lenf = (str.length() - str.lastIndexOf(" "))-1;
        return lenf;
    }


    public static void main(String[] args) {

        String str = " the sky is bluwe   ";
        int length = solution(str);
        System.out.println(length);

       String[] words = str.trim().split("\\s+");
        System.out.println(Arrays.toString(words));
//        String[] ans = new String[words.length];
        List<String> ans = Arrays.asList(words);

        for (int i = words.length-1; i >=0 ; i--) {
            ans.add(words[i]);
        }

        System.out.println(ans);

    }
}
