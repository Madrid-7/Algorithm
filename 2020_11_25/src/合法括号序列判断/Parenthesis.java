package 合法括号序列判断;

import java.util.Stack;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if (n % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                stack.push(A.charAt(i));
            } else if (A.charAt(i) == ')') {
                if (stack.empty()) {
                    return false;
                } else {
                    stack.pop();
                }
            } else
                return false;
        }
        return true;
    }
}
