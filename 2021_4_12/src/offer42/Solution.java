package offer42;

/**
 * @author ：ZXF
 * @program: 2021_4_12
 * @description:
 * @date ：2021-04-12 23:27
 */

class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int ret = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i-1] + nums[i], nums[i]);
            ret = Math.max(ret, nums[i]);
        }
        return ret;
    }
}
