package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NGR {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 4, 12, 5, 2, 10};
//        int[] ans = right(arr);
        int[] ans1 = rightStack(arr);
        System.out.println(Arrays.toString(ans1));
    }

    public static int[] right(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    arr[i] = arr[j];
                    break;
                }
            }
        }
        return arr;
    }

    public static int[] rightStack(int[] arr){

        int[] newArr = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length-1; i>=0; i--) {

            newArr[i] = -1;

            while (!stack.empty()){
                int top = stack.peek();
                if (top>arr[i]){
                    newArr[i] = top;
                    break;
                }
                stack.pop();
            }
            stack.push(arr[i]);

        }
        return newArr;
    }
}
