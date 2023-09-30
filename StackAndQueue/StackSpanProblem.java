package src.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class StackSpanProblem {


    public static void main(String[] args) {

        int[] arr = new int[]{100, 80, 60, 70, 60, 75, 85};
        int[] ans = spanStack(arr);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] span(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i-1; j >=0 ; j--) {
                if (arr[j]<=arr[i]){
                    count++;
                }
                else {
                    break;
                }
            }
            arr[i] = count;
        }
        return arr;
    }



    public static int[] spanStack(int[] arr){

        int[] newArr = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = 1;
            while (!stack.empty() && arr[stack.peek()]<arr[i]){
                stack.pop();
                if (stack.empty()){
                    newArr[i] = i+1;
                }else {
                    newArr[i] = i - stack.peek();
                }
            }
            stack.push(i);
        }
        return newArr;
    }
}
