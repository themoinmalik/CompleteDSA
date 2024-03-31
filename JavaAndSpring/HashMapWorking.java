package src.JavaAndSpring;

import java.util.HashMap;

public class HashMapWorking {


    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap();

        map.put(1, "Moin MAlik");
        map.put(2, "Malik MAlik");
        map.put(1, "hello world");

        System.out.println(map.keySet());
        System.out.println(map.get(1));


    }
}
