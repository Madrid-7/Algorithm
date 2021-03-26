package 用两个栈实现队列;

import java.util.Stack;

/**
 * @author ：ZXF
 * @program: 2021_3_25
 * @description:
 * @date ：2021-03-25 14:18
 */

public class CQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public CQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.add(stack1.pop());
            }
        }
        if (stack2.empty()) {
            return -1;
        }
        return stack2.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */
