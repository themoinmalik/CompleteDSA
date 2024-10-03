package src.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KsortedArray {


    public static void main(String[] args) {

        int[] nums = new int[]{2,4,1,4,1,5,78,9};
        int k = 3;
        int[] ans = KsortedArraymethod(nums, k);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] KsortedArraymethod(int[] arr, int k) {

        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> b - a);

        int inx = 0;

        for (int i = 0; i < arr.length; i++) {
            minheap.offer(arr[i]);

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
