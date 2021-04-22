package offer17;

/**
 * @author ：ZXF
 * @program: 2021_4_22
 * @description:
 * @date ：2021-04-22 19:57
 */

public class Solution {
    public int[] printNumbers(int n) {
        int i = 0;
        for (int j = 1; j <= n; j++) {
            i = 10 * i + 9;
        }
        int[] arr = new int[i];
        for (int j = 1; j <= i; j++) {
            arr[j-1] = j;
        }
        return arr;
    }
}
