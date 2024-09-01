package StackAndQueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class NGR {

    public static void main(String[] args) {

        int[] arr = new int[]{6,3,2,4};
//        int[] ans = right(arr);
        List<Integer> ans1 = rightStack(arr);
        System.out.println(ans1);
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

    public static List<Integer> rightStack(int[] arr){

//        int[] newArr = new int[arr.length];
        List<Integer> list = new ArrayList<>();
//
        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i<arr.length; i++) {
//
//            newArr[i] = -1;
//
//            while (!stack.empty()){
//                int top = stack.peek();
//                if (top>arr[i]){
//                    newArr[i] = top;
//                    break;
//                }
//                stack.pop();
//            }
//            stack.push(arr[i]);
//
//        }


        for(int i = 0; i < arr.length; i++){
            //Pushing element onto the stack either stack is empty or element is less than stack top.
            if(stack.isEmpty() || arr[i] < stack.peek()) {
                stack.push(arr[i]);
            }else{

                //If found the element greater than stack top then that is the next greater element so we need to add it to the answer list.
                while(!stack.isEmpty()){

                    list.add(0);
                    if (stack.peek() < arr[i]){
                        list.add(arr[i]);
                        stack.pop();
                    }
                }
                //Pushing that greater element in stack for next cycle
                stack.push(arr[i]);
            }
        }
        return list;
    }
}
