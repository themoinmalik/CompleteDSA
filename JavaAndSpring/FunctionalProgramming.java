package src.JavaAndSpring;

import java.util.*;
import java.util.stream.Collectors;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);

        List<Integer> list1 = Arrays.asList(2,1,4,6,10);

        System.out.println(list1);

       List<Integer> ans = list1.stream()
               .filter(e->e%2 == 0)
               .collect(Collectors.toList());
        System.out.println(ans);

        System.out.println(list1);

        ///

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am Runnable...");
            }
        };

        runnable.run();

        Runnable run = () -> {

            System.out.println(" ia m from runnable");

        };

        run.run();





    }


}
