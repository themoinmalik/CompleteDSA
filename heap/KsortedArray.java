package src.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KsortedArray {

    public static int[] KsortedArraymethod(int[] arr, int k) {


        PriorityQueue<Integer> minheap = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        int inx = 0;

        for (int i = 0; i < arr.length; i++) {
            minheap.add(arr[i]);

            if (minheap.size() > k) {
                arr[inx++] = minheap.poll();
            }
        }

        for (int i = k + 1; i < arr.length; i++) {
            arr[i] = minheap.poll();
        }

        return arr;
    }

}
