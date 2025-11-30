package src.top50;

import java.util.HashMap;

public class FirstRepeatingCharacter {

    static char firstRepeatingCharacter(String str){
        HashMap<Character,Boolean> visited = new HashMap<>();
        char[] characters = str.toCharArray();
        for(char ch : characters){
            if(visited.containsKey(ch)) return ch;
            else visited.put(ch, true);
        }
        return '\0';
    }


}
