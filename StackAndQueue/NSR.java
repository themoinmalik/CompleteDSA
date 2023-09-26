package StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NSR {

    public static void main(String[] args) {

        int[] arr = new int[]{9, 4, 15, 6, 2, 10};
        int[] ans = rightFind(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] rightFind(int[] arr){

        Stack<Integer> stack = new Stack<>();
        int[] newArr = new int[arr.length];

        for (int i = arr.length-1; i >=0 ; i--) {
         newArr[i] = -1;
         while (!stack.empty()){

             int top = stack.peek();
             if (top<arr[i]){
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
