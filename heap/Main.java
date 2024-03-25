package src.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {

        int[] arr = new int[]{1,1,1,2,2,3};
        Arrays.sort(arr);

//        int[] ans =  KsortedArray.KsortedArraymethod(arr, 3);

        List<Integer> ans = KClosestNo.findClosestElements(arr,3,4);

        int[] kfrequent = Kfrequent.kelements(arr, 2 );

        System.out.println(Arrays.toString(kfrequent));

    }
}
