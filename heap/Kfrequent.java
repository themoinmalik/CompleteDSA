package src.heap;

import java.util.PriorityQueue;

public class Kfrequent {


    public static int[] kelements(int[] arr, int k) {


        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> (b[0] == a[0]) ? b[1] - a[1] : b[0] - a[0]);

        int count = 1;
        int prev = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == prev) {
                count++;
            } else {
                int[] a = new int[2];
                a[0] = count;
                a[1] = prev;
                maxheap.add(a);
                count = 1;
                prev = arr[i];
            }
        }

        int[] a = new int[2];
        a[0] = count;
        a[1] = prev;
        maxheap.add(a);


        int[] newArr = new int[k];

        for (int i = 0; i < k; i++) {

            newArr[i] = maxheap.poll()[1];

        }

        return newArr;
    }
}
