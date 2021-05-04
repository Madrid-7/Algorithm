package offer31;

import java.util.Stack;

/**
 * @author ：ZXF
 * @program: 2021_5_2
 * @description:
 * @date ：2021-05-03 11:42
 */

public class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int num : pushed) {
            stack.add(num);
            while (!stack.isEmpty() && stack.peek()==popped[i]) {
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
