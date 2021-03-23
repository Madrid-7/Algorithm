package 左右最值最大差;

/**
 * @author ：ZXF
 * @program: 2021_3_23
 * @description:
 * @date ：2021-03-23 12:48
 */

public class MaxGap {
    public int findMaxGap(int[] A, int n) {
        // write code here
        int Max = Math.abs(A[0] - A[n-1]);
        int leftMax = A[0];
        int rightMax = 0;
        for (int i = 0; i < n-1; i++) {

            if (A[i] > leftMax)
                leftMax = A[i];
            rightMax = A[i + 1];
            for (int j = i + 1; j < n; j++) {
                if (A[j] > rightMax)
                    rightMax = A[j];
            }
            if (Math.abs(leftMax - rightMax) > Max) {
                Max = Math.abs(leftMax - rightMax);
            }
        }
        return Max;
    }
}
