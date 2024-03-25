package src.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Kfrequent {


    public static List<Integer> kelements(int[] arr, int k, int x){


        PriorityQueue<Pair> maxheap = new PriorityQueue<>((a,b) -> (a.element==b.element) ? b.index - a.index : b.element-a.element );


        for (int i = 0; i < arr.length; i++) {

            maxheap.add(new Pair(Math.abs(arr[i] - x), arr[i]));

            if (maxheap.size()>k){
                maxheap.poll();
            }
        }

        List<Integer> list = new ArrayList<>();

        while (!maxheap.isEmpty()){
            list.add()
        }
    }
}
