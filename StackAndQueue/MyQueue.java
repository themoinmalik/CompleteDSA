package StackAndQueue;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> st1;
    Stack<Integer> st2;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }


    public void push(int x) {

        if (st1.isEmpty()) {
            return;
        }
        st1.push(x);
    }

    public int pop() {

        transferTost2();
        int ans = st2.pop();
        while (!st2.isEmpty()) {
            st1.push(st2.pop());
        }
        return ans;

    }

    public int peek() throws Exception {
        if (st2.isEmpty()) {
            transferTost2();
        }
        int ans = st2.peek();

         return ans;
    }

    public boolean empty() {
        return st1.isEmpty() && st2.isEmpty();
    }

    public void transferTost2(){
        while (!st1.isEmpty()){
            st2.push(st1.pop());
        }
    }
}
