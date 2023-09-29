package src.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

public class StackSpanProblem {


    public static void main(String[] args) {

        int[] arr = new int[]{2,4,5,6};
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

            while (!stack.empty()){
                int top = stack.peek();

                if (arr[top]<=arr[i]){
                    newArr[i]++;
                }
            }
            stack.push(i);

        }

        return newArr;
    }
}
