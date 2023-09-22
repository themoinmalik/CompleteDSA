package StackAndQueue;

import java.util.Stack;

public class StackDSA {

    private static int top = -1;
    private static final int size = Integer.MAX_VALUE;
    private static final int[] stack_arr = new int[size];

    // push data in stack ...
    public static void push(int data){

        if (top == stack_arr[size] -1 ){
            System.out.println("Stack Overflow");
            return;
        }
        top = top + 1;
        stack_arr[top] = data;

    }

    // pop ...
    public static void pop(){

        if (top == -1){
            System.out.println("stack Underflow");
            return;
        }
        System.out.println(stack_arr[top]);
        top = top-1;

    }

}
