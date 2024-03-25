package src.heap;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {

        int[] arr = new int[]{6,5,3,2,8,10,9};

//        int[] ans =  KsortedArray.KsortedArraymethod(arr, 3);

        List<Integer> ans = KClosestNo.findClosestElements(arr,3,4);

        System.out.println(ans);

    }
}
