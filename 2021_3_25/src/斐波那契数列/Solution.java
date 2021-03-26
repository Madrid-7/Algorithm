package 斐波那契数列;

/**
 * @author ：ZXF
 * @program: 2021_3_25
 * @description:
 * @date ：2021-03-25 20:08
 */

public class Solution {
    public int fib(int n) {
        if (n < 3)
            return n;
        int f = 0;
        int ff = 1;
        int result = 0;
        while (n > 2) {
            result = f + ff;
            if (result > 1000000007) {
                result %= 1000000007;
            }
            f = ff;
            ff = result;
            n--;
        }
        return result;
    }
}
