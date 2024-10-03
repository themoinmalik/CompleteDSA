package src.heap;

import java.util.PriorityQueue;

public class KthLargest {


    public static void main(String[] args) {

        int[] nums = new int[]{2,4,1,0,5,7,9};
        int k = 3;
        int ans = kthlargest(nums, k);
        System.out.println(ans);
        int ans2 = kthSmallest(nums, k);
        System.out.println(ans2);

    }



    public static Integer kthlargest(int[] nums, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for (int i:nums){
            pq.offer(i);
            if (pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();

    }


    public static Integer kthSmallest(int[] nums, int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);  //max heap descending order ....


        for (int i : nums){
            pq.offer(i);
            if (pq.size()>k){
                pq.poll();
            }
        }

        return pq.peek();
    }
}
