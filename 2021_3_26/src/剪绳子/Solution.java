package 剪绳子;

/**
 * @author ：ZXF
 * @program: 2021_3_26
 * @description:
 * @date ：2021-03-26 20:11
 */

class Solution {
    public int cuttingRope(int n) {
        int[] dp=new int[n+1];
        dp[2]=1;//n=2时，最大乘积为1；dp[1]可以忽略
        for(int i=3;i<n+1;i++){
            for(int j=1;j<i;j++){
                //j即是将n从第j处分割
                //Math.max(j*(i-j),j*dp[i-j]) 中 j*(i-j)指的是分割一次后的乘积；j*dp[i-j]指
                //分割一次后，剩余部分继续分割后的最大乘积,前面已经求解过，所以只需要取结果
                //下面综合起来就是，但j取不同时，与前一次j取值后的dp[i]比较，取最大值，直到j遍历完
                dp[i]=Math.max(dp[i],Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n];
    }
}
