package src.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class checkRight {

    public static void main(String[] args) {
        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] ans = rightCheck(arr);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] rightCheck(int[] arr){

        int n = arr.length;
        int[] newArr = new int[n];
        Stack<Integer> stack = new Stack<>();

        Histogram.findCount(arr, newArr, n, stack);
        return newArr;
    }
}
