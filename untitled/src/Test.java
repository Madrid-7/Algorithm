import java.util.Stack;

/**
 * @author ：ZXF
 * @program: untitled
 * @description:
 * @date ：2021-05-21 15:29
 */

public class Test {
    public static void main(String[] args) {
        String s = "abccbde";
        Stack<String> stack;
        stack = new Stack<String>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.add(s.substring(i,i+1));
            } else if (stack.peek().equals(s.substring(i,i+1))){
                stack.pop();
            } else {
                stack.add(s.substring(i,i+1));
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        StringBuffer sb = new StringBuffer(res);
        sb = sb.reverse();
        res = sb.toString();
        System.out.println(res);
    }
}
