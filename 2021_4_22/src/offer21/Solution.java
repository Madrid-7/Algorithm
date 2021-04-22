package offer21;

/**
 * @author ：ZXF
 * @program: 2021_4_22
 * @description:
 * @date ：2021-04-22 20:56
 */

public class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left < right) {
            if (nums[left] % 2 == 1) {
                left++;
            } else if (nums[right] % 2 == 0) {
                right--;
            } else {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
        return nums;
    }
}
