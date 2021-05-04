package 整数反转;

/**
 * @author ：ZXF
 * @program: 2021_5_2
 * @description:
 * @date ：2021-05-03 21:18
 */

public class Solution {
    public int reverse(int x) {
        long n = 0;
        while (x!=0) {
            n = n*10 + x%10;
            x /= 10;
        }
        return (int)n == n ? (int)n : 0;
    }

    public int reverse1(int x) {
        String xString = Integer.toString(x);
        String string = xString;
        int flag = 1;
        if (x < 0) {
            flag = -1;
            string = xString.substring(1);
        }
        try {
            return Integer.valueOf((new StringBuilder(string)).reverse().toString()) * flag;
        }catch (Exception e){
            return 0;
        }
    }
}
