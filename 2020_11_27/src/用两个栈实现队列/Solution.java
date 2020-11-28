package 用两个栈实现队列;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                int tmp = stack1.pop();
                stack2.push(tmp);
            }
        }
        return stack2.pop();
    }
}