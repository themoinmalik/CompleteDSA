package src.heap;

import java.security.KeyPair;
import java.util.Comparator;
import java.util.*;


class KClosestNo {
    private static class Node {
        private int diff;
        private int index;

        public Node(int index, int diff) {
            this.diff = diff;
            this.index = index;
        }
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Node> pq = new PriorityQueue<>(
                (a, b) -> (a.diff == b.diff) ? b.index - a.index : b.diff - a.diff
        );

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Node(i, Math.abs(x - arr[i])));

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> ans = new ArrayList<>();

        while (!pq.isEmpty()) {
            ans.add(arr[pq.poll().index]);
        }

        Collections.sort(ans);
        return ans;
    }
}
