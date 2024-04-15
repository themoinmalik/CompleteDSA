package src.JavaAndSpring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamJava {


    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,4,1,6,78,3);

       List<Integer> ans = list.stream()
               .filter(e-> e>3)
               .map(e -> e*2)
               .collect(Collectors.toList());

        System.out.println(ans);


    }
}
