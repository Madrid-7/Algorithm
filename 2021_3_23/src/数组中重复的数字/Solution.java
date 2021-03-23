package 数组中重复的数字;

import java.util.HashSet;

/**
 * @author ：ZXF
 * @program: 2021_3_23
 * @description:
 * @date ：2021-03-23 17:26
 */

public class Solution {
    public int findRepeatNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }
}
