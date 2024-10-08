package StackAndQueue;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

        boolean ans = checkParenthesis("()[]");
        System.out.println(ans);

    }

    public static boolean checkParenthesis(String str){
        Stack<Character> stack = new Stack<>();

        for (char i: str.toCharArray()) {
            if (i == '('){
                stack.push(')');
            } else if (i == '[') {
                stack.push(']');
            } else if (i == '{') {
                stack.push('}');                
            } else if (stack.isEmpty() || stack.pop() !=i) {
                return false;
            }
        }
        return stack.empty();

    }
}
