package 青蛙跳台阶问题;

/**
 * @author ：ZXF
 * @program: 2021_3_25
 * @description:
 * @date ：2021-03-25 23:02
 */

class Solution {
    public int numWays(int n) {
        if (n == 0)
            return 1;
        int f = 0;
        int ff = 1;
        int result = 0;
        while (n > 0) {
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
