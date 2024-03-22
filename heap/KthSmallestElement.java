package src.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        setMinHeap();
    }


    public static void setMinHeap() {
        // create min heap ...
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(12);
        minHeap.add(0);


        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(
                10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        maxHeap.add(10);
        maxHeap.add(20);
        maxHeap.add(30);


        //min
        System.out.println(minHeap.poll());
        System.out.println(minHeap.poll());

        System.out.println("max...");

        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());
        System.out.println(maxHeap.poll());

        int[] arr = new int[]{2,4,1,5,9,8,7,10};
        int ans = findKthMax(arr, 4);
        System.out.println(ans);


    }
    
    
    public static int findKthMax(int[] arr, int k){
        
        int n = arr.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(10, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0; i < n; i++) {

            maxHeap.add(arr[i]);
            if (maxHeap.size()>k){
                maxHeap.poll();
            }
        }

        return maxHeap.poll();
        
    }


}
