package src.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class NGL {

    public static void main(String[] args) {

        int[] arr = new int[]{9, 4, 15, 6, 2, 10};
        int[] ans = leftFind(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] leftFind(int[] arr){

        Stack<Integer> stack = new Stack<>();
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            newArr[i] = -1;

            while (!stack.empty() && arr[stack.peek()]<arr[i]){
                stack.pop();
            }
            if (stack.empty()){
                newArr[i] = i+1;
            }else {
                newArr[i] = i;
            }
            stack.push(i);
        }

        return newArr;

    }
}
