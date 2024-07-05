package src.TOPDSAQUESTIONS;

import java.util.Stack;

public class ValidParan {


    public static boolean validParan(String st){

        Stack<Character> stack = new Stack<>();

        for (char c: st.toCharArray()){
            if (c == '('){
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.peek() != c) {
                return false;
            }else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
